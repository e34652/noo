package jan.day24.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

	class Emp{ // 클래스명은 테이블과 똑같이 줌 
		private int empno; 
		private String ename; 
		private String job;
		private double sal;
		
		public Emp(int empno, String ename, String job, double sal) {
			super();
			this.empno = empno;
			this.ename = ename;
			this.job = job;
			this.sal = sal;
		}
		
		public int getEmpno() {
			return empno;
		}
		
		public String getEname() {
			return ename;
		}
		
		public String getJob() {
			return job;
		}
		
		public double getSal() {
			return sal;
		}

		@Override
		public String toString() {
			return empno + "\t| " + ename + "  \t|" + job + "     \t" + sal + "\n";
		}
		
		
				
	}

	public class JdbcArrayEx2 {

		public static void main(String[] args) {
			List<Emp> list = new ArrayList<>();
			String url = "jdbc:mysql://localhost:3306/firm"; // 3306 포트의 firm 데이터베이스
			String id = "root"; // 사용자 명
			String pass = "mysql"; // 비밀번호

			Statement stmt = null;
			Connection conn = null;
			
			String sql = "SELECT empno, ename, job, sal FROM firm.emp";

			try {// 실행
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, id, pass);
				stmt = conn.createStatement(); // 어떤 상태를 담을 수 있는 틀
				ResultSet rs = stmt.executeQuery(sql); // sql문을 실행한 상태를 rs에 대입
				while (rs.next()) {
					// int empno = rs.getInt(1); << 위의 sql의 첫번째 열 1 = empno 2 = dname 3= loc
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename"); // = ("dname");
					String job = rs.getString("job");
					int sal = rs.getInt("sal");
					list.add(new Emp(empno, ename, job, sal));
					
					//String str = empno + "\t| " + dname + "  \t|" + loc + "\n"; << 문자열로만 추가할 때는 좋음 
					//list.add(str);

				}

			} catch (SQLException | ClassNotFoundException e) {// | 연산자 사용
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(Emp emp : list) {
			System.out.print(emp.toString());
			
			}
		}
	}
