package monthlytest.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import monthlytest.CRUD.interface1.*;

public class CLI2 {

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
				System.out.println("1.데이터 조회 | 2. 종료");
				System.out.println("----------------------------------------------------------");
				System.out.println("원하시는 업무를 선택해 주세요\n>");
				menuNum = scan.nextLine();

				switch (menuNum) {

				case "1":
					System.out.println("데이터 조회를 시작합니다");
					CLI2.read(conn, stmt);
					break;

				case "2":
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
			;
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
						String empno = rs.getString("empno");
						String ename = rs.getString("ename");
						String job = rs.getString("job");
						String mgr = rs.getString("mgr");
						String hiredate = rs.getString("hiredate");
						String sal = rs.getString("sal");
						String comm = rs.getString("comm");
						String deptno = rs.getString("deptno");
						String str = String.format(
								"사번 : %s   \t | \t이름 : %s   \t | \t직무 : %s \t | \t사수 : %s   \t | \t 입사일 : %s   \t | 급여 : %s   \t | \t수당 : %s   \t | \t부서 코드 : %s   ",
								empno, ename, job, mgr, hiredate, sal, comm, deptno);
						System.out.println(str);
					}
					rs.close();
					break;
				case "2":
					String str = "";
					System.out.println("사원 정보를 조회합니다");
					System.out.println("사번을 입력해 주세요\n>");
					String empno = scan.nextLine();
					System.out.println("성함을 입력해 주세요\n>");
					String ename = scan.nextLine();
					sql = String.format("select * from emp where empno = '%s' and ename = '%s'", empno, ename);
					rs = stmt.executeQuery(sql);
					if (rs.next()) {
						while (rs.next()) {
							String job = rs.getString("job");
							String mgr = rs.getString("mgr");
							String hiredate = rs.getString("hiredate");
							String sal = rs.getString("sal");
							String comm = rs.getString("comm");
							String deptno = rs.getString("deptno");
							str = String.format(
									"사번 : %s | 이름 : %s | 직무 : %s | 사수 : %s | 입사일 : %s | 급여 : %s | 수당 : %s | 부서 코드 : %s",
									empno, ename, job, mgr, hiredate, sal, comm, deptno);
						}
						System.out.println(str);
						CLI2.read2(conn, stmt, ename, empno);

					} else {
						System.out.println("일치하는 사원 정보가 없습니다");
					}
					rs.close();
					break;
				case "3":
					System.out.println("처음 화면으로 돌아갑니다");
					run2 = false;
					break;

				}
			}

		} catch (SQLException e) {
			System.out.println("올바른 값을 입력해주세요");
		}

	}

	static void read2(Connection con, Statement stmt, String ename, String empno) {
		boolean run3 = true;
		while (run3) {
			System.out.println("--------------------------------------");
			System.out.println("1.데이터 수정 | 2.이전");
			System.out.println("--------------------------------------");
			System.out.println("현재 선택된 사번:" + empno);
			System.out.println("원하시는 업무를 선택해 주세요\n>");

			String menuNum2 = scan.nextLine();

			switch (menuNum2) {
			case "1":
				System.out.println("조회된 회원 정보를 수정합니다");
				CLI2.update(con, stmt, empno);
				break;
			case "2":
				System.out.println("돌아갑니다");
				run3 = false;
				break;
			}
		}
	}

	static void update(Connection conn, Statement stmt, String empno) {
		String column = "";
		String sValue = "";
		String sql = "";
		Update update = new Update();
		Ename enam = new Ename();
		Job job = new Job();
		Mgr mgr = new Mgr();
		Sal sal = new Sal();
		Comm comm = new Comm();
		Deptno deptno = new Deptno();

		boolean run4 = true;
		while (run4) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1.이름 | 2.직무 | 3.사수 코드 | 4.급여 | 5.추가 수당 | 6.부서 코드 | 7.이전");
			System.out.println("-----------------------------------------------------------");
			System.out.println("현재 선택된 사번:" + empno);
			System.out.println("변경하실 정보를 선택해 주세요\n>");

			column = scan.nextLine();

			switch (column) {
			case "1":
				update.Update(enam, empno, stmt);
				break;

			case "2":
				update.Update(job, empno, stmt);
				break;

			case "3":
				update.Update(mgr, empno, stmt);
				break;

			case "4":
				update.Update(sal, empno, stmt);
				break;

			case "5":
				update.Update(comm, empno, stmt);
				break;

			case "6":
				update.Update(deptno, empno, stmt);
				break;

			case "7":
				System.out.println("돌아갑니다");
				run4 = false;
				break;

			default:
				System.out.println("다시 입력해주세요");

			}

		}
	}

	public static void main(String[] args) {
		try {
			CLI2.crud();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}