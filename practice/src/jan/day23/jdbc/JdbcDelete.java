package jan.day23.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDelete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 초기 세팅
		String url = "jdbc:mysql://localhost:3306/firm"; // 3306 포트의 firm 데이터베이스
		String id = "root"; // 사용자 명
		String pass = "mysql"; // 비밀번호
		Class.forName("com.mysql.cj.jdbc.Driver"); // << jdbc driver 경로, 로딩 잘 됐나 체크해 줌
		Connection conn = DriverManager.getConnection(url, id, pass); // 위에 셋팅한 정보를 토대로 연결
		Statement stmt = conn.createStatement();
		String sql = "delete from emp where empno = 7777;"; // DB에서 수행할 쿼리문 작성
		int result = stmt.executeUpdate(sql); // stmt로 DB에 전송해 쿼리문 수행
		if (result >= 1) { // 몇번 실행되었나, 실행된 행의 개수, 레코드의 수 
			System.out.println("삭제 성공!" + result);
		} else {
			System.out.println("삭제 실패!" + result);
		}
	}
}
