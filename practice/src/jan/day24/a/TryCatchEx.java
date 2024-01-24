package jan.day24.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) { //<< 나올만한 예외상황 
			
			//예외 처리 코드
			System.out.println("클래스가 존재하지 않습니다"); //throw와 try catch 차이 << throw 무조건 종료 try catch = 예외상황에서 어떻게 할지 코딩 가능
			System.exit(0);
			//e.printStackTrace();
			//예외의 최상위 클래스 = java.lang,Exception, 만능열쇠처럼 사용할 수 있음
			
		} finally {
			System.out.println("반드시 실행 ");
		}
		try {
			Connection conn = DriverManager.getConnection(null);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
