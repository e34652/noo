package jan.day23.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcSelect {
	ArrayList<Data> list = new ArrayList();
	Data data = null;
	
	int empno;
	String ename;
	String job; 
	int mgr;
	String hireDate;
	int sal;
	double comm; 
	int deptno;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    // 초기 세팅
		JdbcSelect js = new JdbcSelect(); 
	    String url = "jdbc:mysql://localhost:3306/firm"; // 3306 포트의 firm 데이터베이스에 연결할 URL
	    String id = "root"; // 데이터베이스 접속에 사용할 사용자 명
	    String pass = "mysql"; // 데이터베이스 접속에 사용할 비밀번호
	    Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버를 로딩하여 사용 가능하게 함, 연결 체크
	    Connection conn = DriverManager.getConnection(url, id, pass); // 셋팅한 정보를 바탕으로 데이터베이스에 연결
	    Statement stmt = conn.createStatement(); // SQL 문을 실행하기 위한 Statement 객체 생성
	    String sql = "select * from emp"; // DB에서 수행할 UPDATE 쿼리문 작성
	    ResultSet rs = stmt.executeQuery(sql); 
	    while(rs.next()) {
	    	js.empno = rs.getInt("empno");
	    	js.ename = rs.getString("ename");
	    	js.job = rs.getString("job");
	    	js.mgr = rs.getInt("mgr");
	    	if(String.valueOf(rs.getInt("mgr")) == null ) {
	    		js.mgr = 0;}
	    	js.hireDate = rs.getString("hireDate");
	    	
	    	js.sal = rs.getInt("sal");
	    	js.comm = rs.getDouble("comm");
	    	if(String.valueOf(rs.getDouble("comm")) == null ) {
	    		js.comm = 0;}
	    	js.deptno = rs.getInt("deptno");
	    	
	    	js.list.add(new Data(js.empno, js.ename, js.job, js.mgr,
	    			js.hireDate, js.sal, js.comm, js.deptno));
	    	
	}
	    for(int i = 0; i<js.list.size(); i++ ) {
	    	System.out.println(js.list.get(i).toString());
	    	
	    }
	    
	    // 사용한 자원(Statement, Connection)을 닫는다.
	   
	}
}