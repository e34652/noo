package jan.day22.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/company"; // 지정 url, localhost = 포트 번호 
		String id = "root"; // id
		String pass = "mysql"; // 설정했던 pw 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("mysql 드라이버 로딩");
		Connection conn = DriverManager.getConnection(url, id, pass); 
		System.out.println("mysql 접속 성공");
		Statement stmt = conn.createStatement(); // 텍스트를 쿼리 명령어로 바꾸어 DB에 전송해주는 메소드, 큰따옴표 안에 텍스트로 커리문 작성 
		ResultSet rs = stmt.executeQuery("select * from emp"); // ResultSet << SQL문 실행 결과를 얻어오기 위한 클래스 커서를 관리, Select문에 기술된 컬럼 순번    
		while(rs.next()) { // rs.next() << 커서를 다음 행으로 보내는 명령어 행을 다 훑고 빈 행에 갈 때까지 true임
			int empno = rs.getInt("empno") ; // 일치하는 컬럼 명의 Int 값을 get함
			String ename = rs.getString("ename"); // 일치하는 컬럼 명의 String 값을 get함, 해당 컬럼과 일치하는 타입의 변수를 선언해야함 
			String job = rs.getString("job"); // 일치하는 컬럼 명의 String 값을 get함
			int mgr = rs.getInt("mgr"); // 일치하는 컬럼 명의 String 값을 get함
			String hiredate = rs.getString("hiredate");
			double sal = rs.getDouble("sal");
			double comm = rs.getDouble("comm"); // 일치하는 컬럼 명의 String 값을 get함
			int deptno = rs.getInt("deptno"); // 일치하는 컬럼 명의 String 값을 get함
			
			System.out.printf("%d, %s, %s, %d, %s, %f, %f, %d\n", empno, ename, job, mgr, hiredate, sal, comm, deptno);
		}
		
		conn.close();
	}

}
