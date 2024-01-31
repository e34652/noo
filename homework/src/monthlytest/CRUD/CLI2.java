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
				System.out.println("1.데이터 조회 | 2.데이터 추가 | 3. 종료");
				System.out.println("----------------------------------------------------------");
				System.out.println("원하시는 업무를 선택해 주세요\n>");
				menuNum = scan.nextLine();

				switch (menuNum) {

				case "1":
					System.out.println("데이터 조회를 시작합니다");
					CLI2.read(conn, stmt);
					break;
				case "2":
					System.out.println("데이터 추가를 시작합니다");
					CLI2.create(conn, stmt);
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
			System.out.println("1.데이터 수정 | 2.데이터 삭제 | 3.이전");
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
				System.out.println("조회된 회원 정보를 삭제합니다");
				CLI2.delete(con, stmt, ename, empno);
				return;
			case "3":
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
				Ename enam = new Ename();
				update.Update(enam, empno, stmt);
				break;

			case "2":
				Job job = new Job();
				update.Update(job, empno, stmt);
				break;

			case "3":
				Mgr mgr = new Mgr();
				update.Update(mgr, empno, stmt);
				break;

			case "4":
				Sal sal = new Sal();
				update.Update(sal, empno, stmt);
				break;

			case "5":
				Comm comm = new Comm();
				update.Update(comm, empno, stmt);
				break;

			case "6":
				Deptno deptno = new Deptno();
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

	static void delete(Connection conn, Statement stmt, String ename, String empno) {

		try {
			String sql = String.format("delete from emp where ename = '%s' and empno = '%s'", ename, empno);

			int result = stmt.executeUpdate(sql); // stmt로 DB에 전송해 쿼리문 수행

			if (result >= 1) { // 몇번 실행되었나, 실행된 행의 개수, 레코드의 수
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			System.out.println("올바른 값을 입력해주세요");
		}

	}

	static void create(Connection conn, Statement stmt) {

		try {

			System.out.printf("사번을 입력해 주세요\n>");
			int empno = Integer.parseInt(scan.nextLine());

			System.out.print("이름을 입력해 주세요\n>");
			String ename = scan.nextLine();

			System.out.print("직무를 입력해 주세요\n>");
			String job = scan.nextLine();

			System.out.print("사수 코드를 입력해 주세요\n>");
			int mgr = Integer.parseInt(scan.nextLine());

			System.out.println("입사일을 입력해 주세요");
			System.out.print("연> ");
			String year = scan.nextLine();
			if (year.length() == 2 && Integer.parseInt(year) > 24) {
				year = "19" + year;
			} else if (year.length() == 2 && Integer.parseInt(year) <= 24) {
				year = "20" + year;
			} else if (year.length() != 2 || year.length() != 4) {
				System.out.println("입사년도를 바르게 입력해 주세요");
				return;
			}

			System.out.print("월> ");
			String month = scan.nextLine();

			if (Integer.parseInt(month) > 12) {
				System.out.println("입사한 달을 정확히 입력해 주세요");
				return;
			}
			if (Integer.parseInt(month) < 10) {
				month = "0" + month;
			}

			System.out.print("일> ");
			String day = scan.nextLine();
			if (Integer.parseInt(day) > 31) {
				System.out.println("입사일을 정확히 입력해 주세요");
			}
			if (Integer.parseInt(day) < 10) {
				day = "0" + day;
			}

			String hiredate = year + '-' + month + "-" + day;
			System.out.println(hiredate);

			System.out.print("급여를 입력해 주세요\n>");
			String sal = scan.nextLine();

			System.out.print("수당을 입력해 주세요\n>");
			String comm = scan.nextLine();

			System.out.print("부서 코드를 입력해 주세요\n>");
			String deptno = scan.nextLine();
			if (deptno.length() > 2) {
				System.out.println("부서 코드는 2자리 수로 입력해 주세요");
				return;
			}

			String str = String.format(
					"사번 : %s | 이름 : %s | 직무 : %s | 사수 : %s | 입사일 : %s | 급여 : %s | 수당 : %s | 부서 코드 : %s", empno, ename,
					job, mgr, hiredate, sal, comm, deptno);

			String sql = String.format("insert into emp values (%s, '%s', '%s', %s, '%s', %s, %s, %s)", empno, ename,
					job, mgr, hiredate, sal, comm, deptno);

			int result = stmt.executeUpdate(sql);

			if (result == 1) {
				System.out.println("추가 성공\n" + str);
			} else {
				System.out.println("추가 실패");
			}

		} catch (SQLException e) {
			System.out.println("올바른 값을 입력해 주세요");
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