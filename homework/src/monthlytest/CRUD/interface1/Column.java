package monthlytest.CRUD.interface1;

import java.sql.Statement;
import java.util.Scanner;

public interface Column{

	
	Scanner scan = new Scanner(System.in);
	
	public void update(String empno, Statement stmt);
	
	

}
