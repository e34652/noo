package jan.day24.jdbc.mission;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleMenu {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/firm";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "mysql";
	static Scanner scan = new Scanner(System.in);
	static List<Dept> list = new ArrayList();

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {

			boolean exit = false;

			while (!exit) {
				System.out.println("1. 데이터 보기");
				System.out.println("2. 데이터 삽입");
				System.out.println("3. 종료");
				System.out.print("선택하세요: ");

				String choice = scan.nextLine();

				switch (choice) {
				case "1":
					viewData(connection);
					break;
				case "2":
					insertData(connection);
					break;
				case "3":
					exit = true;
					break;
				default:
					System.out.println("유효하지 않은 선택. 다시 시도하세요.");
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void viewData(Connection connection) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement stmt = connection.createStatement();
			String sql = "select * from firm.dept;";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				list.add(new Dept(deptno, dname, loc));
			}
			System.out.println("조회하고싶은 데이터를 입력해주세요 (1=Deptno, 2=Dname, 3=Loc, 4=전부");
			String column = scan.nextLine();
			for (Dept dept : list) {
				switch (column) {
				case "1":
					System.out.println(dept.getDeptno());
					break;
				case "2":
					System.out.println(dept.getDname());
					break;
				case "3":
					System.out.println(dept.getLoc());
					break;
				case "4":
					System.out.println(dept.toString());
					break;
				}
			}
			list.clear();
		} catch (SQLException e) {
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	private static void insertData(Connection connection) {
		System.out.println("데이터 입력을 시작합니다");
		System.out.print("부서번호:");
		int deptno = Integer.parseInt(scan.nextLine());
		System.out.print("부서이름:");
		String dname = scan.nextLine();
		System.out.print("부서위치:");
		String loc = scan.nextLine();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Statement stmt = connection.createStatement();
			String sql = "insert into dept(deptno, dname, loc) values (" + deptno + ", '" + dname + "', '" + loc + "')";
			int result = stmt.executeUpdate(sql);

			if (result == 1) {
				System.out.println("입력성공!");
			} else {
				System.out.println("입력실패!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
