package jan.day24.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcArrayEx {

	public static void main(String[] args) {
		List<Dept> list = new ArrayList<>();
		String url = "jdbc:mysql://localhost:3306/firm"; // 3306 포트의 firm 데이터베이스
		String id = "root"; // 사용자 명
		String pass = "mysql"; // 비밀번호

		Statement stmt = null;
		Connection conn = null;

		String sql = "SELECT deptno, dname, loc FROM firm.dept";

		try {// 실행
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement(); // 어떤 상태를 담을 수 있는 틀
			ResultSet rs = stmt.executeQuery(sql); // sql문을 실행한 상태를 rs에 대입
			while (rs.next()) {
				// int deptno = rs.getInt(1); << 위의 sql의 첫번째 열 1 = deptno 2 = dname 3= loc
				int deptno = rs.getInt("deptno");
				String dname = rs.getString(2); // = ("dname");
				String loc = rs.getString("loc");
				list.add(new Dept(deptno, dname, loc));
				
				//String str = deptno + "\t| " + dname + "  \t|" + loc + "\n"; << 문자열로만 추가할 때는 좋음 
				//list.add(str);

			}

		} catch (SQLException | ClassNotFoundException e) {// | 연산자 사용
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Dept dept : list) {
		System.out.print(dept.toString());
		System.out.print(dept.getDeptno());
		System.out.print("\t" + dept.getDname());
		System.out.println("    \t" + dept.getLoc());
		}
	}
}
//catch는 위에서 하나가 걸리면 빠져나가기 때문에 가장 하위 예외부터 catch 하도록 코딩을 하자 귀찮으면 그냥 Exception만  
//Finally는 catch에 걸리고 빠져나가도 무조건 실행됨 

/*
 * } catch (SQLException e) {// catch문 중첩시키기 << 하위 오류부터
 * 
 * e.printStackTrace();
 * 
 * }catch (ClassNotFoundException e) {// catch문 중첩시키기
 * 
 * e.printStackTrace();
 * 
 */
