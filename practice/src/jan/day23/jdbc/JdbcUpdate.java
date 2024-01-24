package jan.day23.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    // 초기 세팅
	    String url = "jdbc:mysql://localhost:3306/firm"; // 3306 포트의 firm 데이터베이스에 연결할 URL
	    String id = "root"; // 데이터베이스 접속에 사용할 사용자 명
	    String pass = "mysql"; // 데이터베이스 접속에 사용할 비밀번호
	    Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버를 로딩하여 사용 가능하게 함, 연결 체크
	    Connection conn = DriverManager.getConnection(url, id, pass); // 셋팅한 정보를 바탕으로 데이터베이스에 연결
	    Statement stmt = conn.createStatement(); // SQL 문을 실행하기 위한 Statement 객체 생성
	    String sql = "update emp set sal = 6000 where empno = 7777;"; // DB에서 수행할 UPDATE 쿼리문 작성
	    int result = stmt.executeUpdate(sql); // Statement를 사용하여 쿼리문을 실행하고, 업데이트된 행의 수를 반환
	    if (result >= 1) { // 업데이트가 성공했을 경우
	        System.out.println("갱신 성공! 업데이트된 행의 수: " + result); // 같은 값으로 수정해도 계속 수행함, 구별못함  
	    } else {
	        System.out.println("갱신 실패! 업데이트된 행의 수: " + result);
	    }
	    // 사용한 자원(Statement, Connection)을 닫는다.
	    stmt.close();
	    conn.close();
	}
}