package monthlytest.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CLI {

	static Scanner scan = new Scanner(System.in);

	static void crud() throws SQLException, ClassNotFoundException {

		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, id, pass);
		Statement stmt = conn.createStatement();

		try (conn; stmt) {

			String menuNum;
			boolean run = true;

			while (run) {
				System.out.println("----------------------------------------------------------");
				System.out.println("1.데이터 조회 | 2.데이터 추가 | 3. 종료");
				System.out.println("----------------------------------------------------------");
				System.out.println("원하시는 업무를 선택해 주세요\n>");
				menuNum = scan.nextLine();

				switch (menuNum) {

				case "1":
					System.out.println("데이터 조회를 시작합니다");

					CLI.read(conn, stmt);
					break;
				case "2":
					System.out.println("데이터 추가를 시작합니다");
					CLI.create(conn, stmt);
					break;
				case "3":
					System.out.println("프로그램을 종료합니다");
					run = false;
					break;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void read(Connection conn, Statement stmt) {
		try {
			boolean run2 = true;
			String sql = "select * from emp";
			ResultSet rs = stmt.executeQuery(sql);

			while (run2) {
				System.out.println("---------------------------------");
				System.out.println("1.전체 조회 | 2.사원 조회 | 3. 처음으로");
				System.out.println("---------------------------------");
				System.out.println("원하시는 업무를 선택해 주세요\n>");
				String menuNum1 = scan.nextLine();

				switch (menuNum1) {
				case "1":
					System.out.println("전체 사원 정보를 불러옵니다");
					sql = "select * from emp";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						System.out.print("사번: " + rs.getString("empno") + "   \t | \t");
						System.out.print("이름: " + rs.getString("ename") + "   \t | \t");
						System.out.print("담당 업무:" + rs.getString("job") + "    \t | \t");
						System.out.print("관리자 번호: " + rs.getString("mgr") + "   \t | \t");
						System.out.print("입사일: " + rs.getString("hiredate") + "   \t | \t");
						System.out.print("추가수당: " + rs.getString("comm") + " \t | \t");
						System.out.println("부서번호: " + rs.getString("deptno") + "   \t | \t");
					}
					rs.close();
					break;
				case "2":
					System.out.println("사원 정보를 조회합니다");
					System.out.println("사번을 입력해 주세요\n>");
					String empno = scan.nextLine();
					System.out.println("성함을 입력해 주세요\n>");
					String ename = scan.nextLine();
					sql = "select * from emp where '" + empno + "' and ename = '" + ename + "'";
					rs = stmt.executeQuery(sql);
					while (rs.next()) {
						System.out.print(rs.getString("empno") + "\t");
						System.out.print(rs.getString("ename") + "\t");
						System.out.print(rs.getString("job") + "\t");
						System.out.print(rs.getString("mgr") + "\t");
						System.out.print(rs.getString("hiredate") + "\t");
						System.out.print(rs.getString("comm") + "\t");
						System.out.println(rs.getString("deptno"));
					}
					rs.close();
					CLI.read2(conn, stmt, empno, ename);
					break;
				case "3":
					System.out.println("처음 화면으로 돌아갑니다");
					run2 = false;
					break;

				}
			}

		} catch (SQLException e) {

		}

	}

	static void read2(Connection con, Statement stmt, String name, String num) {
		boolean run3 = true;
		while (run3) {
			System.out.println("--------------------------------------");
			System.out.println("1.데이터 수정 | 2.데이터 삭제 | 3. 처음으로");
			System.out.println("--------------------------------------");
			System.out.println("원하시는 업무를 선택해 주세요\n>");
			String menuNum2 = scan.nextLine();

			switch (menuNum2) {
			case "1":
				System.out.println("조회된 회원 정보를 수정합니다");
				CLI.update(con, stmt, name, num);
			case "2":
				System.out.println("조회된 회원 정보를 삭제합니다");
				CLI.delete(con, stmt, name, num);
			case "3":
				System.out.println("처음으로 돌아갑니다");
				run3 = false;
				break;
			}

		}
	}

	static void update(Connection conn, Statement stmt, String name, String num) {

		try {
			boolean run4 = true;
			while (run4) {
				System.out.println("-----------------------------------------------------------");
				System.out.println("1.이름 | 2.직무 | 3.관리자 번호 | 4.급여 | 5.추가 수당 | 6.부서 번호");
				System.out.println("-----------------------------------------------------------");
				System.out.println("변경하실 정보를 선택해 주세요\n>");
			
			String column = scan.nextLine();
			
			switch(column) {
			case "1":
				column = "ename";
				break;
			case "2":
				column = "job";
				break;
			case "3":
				column = "mgr";
				break;
			case "4":
				column = "sal";
				break;
			case "5":
				column = "comm";
				break;
			case "6":
				column = "deptno";
				break;
			}
			String sql = "update emp set '"+column+"'  where empno = '"+num+"'";  // DB에서 수행할 쿼리문
																										// 작성
			int result = stmt.executeUpdate(sql); // stmt로 DB에 전송해 쿼리문 수행
			if (result == 1) {
				System.out.println("입력 성공!");
			} else {
				System.out.println("입력 실패!");
			}
		} 

		

	}catch (SQLException e) {
		
	}
	}

	static void delete(Connection conn, Statement stmt, String name, String num) {

		try {
			String sql = "delete from emp where ename = '" + name + "', empno = '" + num + "'"; // DB에서 수행할 쿼리문 작성
			int result = stmt.executeUpdate(sql); // stmt로 DB에 전송해 쿼리문 수행
			if (result >= 1) { // 몇번 실행되었나, 실행된 행의 개수, 레코드의 수
				System.out.println("삭제 성공!" + result);
			} else {
				System.out.println("삭제 실패!" + result);
			}
		} catch (SQLException e) {

		}

	}

	static void create(Connection conn, Statement stmt) {

		try {

			System.out.println("\n데이터를 입력해주세요");

			System.out.printf("" + "\n사원 번호를 입력해주세요\n>");
			int empno = Integer.parseInt(scan.nextLine());

			System.out.print("사원 이름을 입력해주세요\n>");
			String ename = scan.nextLine();

			System.out.print("담당 업무를 입력해주세요\n>");
			String job = scan.nextLine();

			System.out.print("담당 관리자의 사번을 입력해주세요\n>");
			int mgr = Integer.parseInt(scan.nextLine());

			System.out.println("입사일을 입력해주세요");
			System.out.print("연> ");
			String year = scan.nextLine();

			System.out.print("월> ");
			String month = scan.nextLine();

			System.out.print("일> ");
			String day = scan.nextLine();
			String hiredate = year + '-' + month + "-" + day;
			System.out.println(hiredate);
			System.out.print("급여를 입력해주세요\n>");
			Double sal = Double.parseDouble(scan.nextLine());

			System.out.print("추가수당을 입력해주세요\n>");
			Double comm = Double.parseDouble(scan.nextLine());

			System.out.print("부서번호를 입력해주세요\n>");
			int deptno = Integer.parseInt(scan.nextLine());

			String sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values ('" + empno
					+ "', '" + ename + "', '" + job + "', '" + mgr + "', '" + hiredate + "', '" + sal + "', '" + comm
					+ "', '" + deptno + "')";
			int result = stmt.executeUpdate(sql);

			if (result == 1) {
				System.out.println("추가 성공");
			} else {
				System.out.println("추가 실패");
			}

		} catch (SQLException e) {

		}

	}

	public static void main(String[] args) {
		try {
			CLI.crud();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}