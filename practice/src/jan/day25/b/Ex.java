package jan.day25.b;

class ThrowClass {
	void method(int x) throws Exception {
		if(x>10) {//account 마이너스 또는 0을 입력했을때 쓰면 좋을듯
			throw new Exception(""); // throw 예외 생성 <<	
		}else {
			System.out.println(x);
		}
		 
		// new Exception(""); // throw가 없어서 예외 안생김
	}
}

public class Ex {

	public static void main(String[] args) {
		ThrowClass tc = new ThrowClass();
		try {
			tc.method(10);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
