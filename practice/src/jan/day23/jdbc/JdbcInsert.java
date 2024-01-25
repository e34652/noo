package jan.day23.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//초기 세팅
		String url = "jdbc:mysql://localhost:3306/firm"; // 3306 포트의 firm 데이터베이스 
		String id = "root"; // 사용자 명
		String pass = "mysql"; // 비밀번호 
		Class.forName("com.mysql.cj.jdbc.Driver"); // << jdbc driver 경로, 로딩 잘 됐나 체크해 줌
		Connection conn = DriverManager.getConnection(url, id, pass); // 위에 셋팅한 정보를 토대로 연결
		Statement stmt = conn.createStatement();
		String sql = "insert into emp values(7777, '곰문곰', '사원',7839, '2024-01-23',3000, null, 10)"; // DB에서 수행할 쿼리문 작성 
		int result = stmt.executeUpdate(sql); // stmt가 실행한 쿼리문이 적용된 행의 수를 리턴
		if(result == 1) {
			System.out.println("입력 성공!");
		}else {
			System.out.println("입력 실패!");
		}
	}

}
