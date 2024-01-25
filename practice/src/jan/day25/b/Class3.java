package jan.day25.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Class3 {

	static void method() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		String sql = "select * from emp";
		// Connection conn = null;
		// Statement stmt = null;
		// ResultSet rs = null;

		try (Connection conn = DriverManager.getConnection(url, id, pass);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);) {
			while (rs.next()) {
				System.out.println(rs.getDouble("sal"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		method();
		Class3 c = new Class3();
		c.method();
	}
}