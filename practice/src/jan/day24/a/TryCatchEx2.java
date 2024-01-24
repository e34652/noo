package jan.day24.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TryCatchEx2 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(null);
		} catch (ClassNotFoundException | SQLException e ) {// | 연산자 사용 
			// TODO Auto-generated catch block
			e.printStackTrace();

			
			//catch는 위에서 하나가 걸리면 빠져나가기 때문에 가장 하위 예외부터 catch 하도록 코딩을 하자 귀찮으면 그냥 Exception만  
			//Finally는 catch에 걸리고 빠져나가도 무조건 실행됨 
			
		/*catch (SQLException e) {// catch문 중첩시키기 << 하위 오류부터  
			
			e.printStackTrace();
			
			}catch (ClassNotFoundException e) {// catch문 중첩시키기 
			
			e.printStackTrace();
			
			}
			*/
			
		}

	}

}
