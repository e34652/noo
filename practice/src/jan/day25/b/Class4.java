package jan.day25.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class4 {

	static void method() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		try (conn; stmt; rs) {
			while (rs.next()) {
				System.out.println(rs.getDouble("sal"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//method();
		Class4 c = new Class4();
		//c.method();
	}
}