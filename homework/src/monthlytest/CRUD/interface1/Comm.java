package monthlytest.CRUD.interface1;

import java.sql.SQLException;
import java.sql.Statement;

public class Comm implements Column {

	@Override
	public void update(String empno, Statement stmt) {
		try {
		String column = "comm";
		System.out.println("수정할 정보 = 수당");
		System.out.println("수당을 입력해 주세요\n>");
		String value = scan.nextLine();
		String sql = String.format("update emp set %s = %s where empno = %s;", column, value, empno);
		
			int result = stmt.executeUpdate(sql);
			if (result == 1)
				System.out.println("수정 성공");
		} catch (SQLException e) {
			System.out.println("올바른 값을 입력해주세요");
		}
	}

}
