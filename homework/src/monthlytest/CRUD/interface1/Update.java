package monthlytest.CRUD.interface1;

import java.sql.Statement;

public class Update {
	public void Update(Column column, String empno, Statement stmt) {
		column.update(empno, stmt);
	}
}
