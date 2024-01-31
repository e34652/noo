package monthlytest.CRUD.interface1;

import java.sql.SQLException;
import java.sql.Statement;

public class Sal implements Column{
	@Override
	public void update(String empno, Statement stmt) {
		String column = "sal";
		System.out.println("수정할 정보 = 급여");
		System.out.println("급여를 입력해 주세요\n>");
		String value = scan.nextLine();
		String sql = String.format("update emp set %s = %s where empno = %s;", column, value, empno); 
		try {
			int result = stmt.executeUpdate(sql);
			if(result == 1)
				System.out.println("수정 성공");
		} catch (SQLException e) {
			System.out.println("올바른 값을 입력해주세요");
		}
	}

}
