package jan.day25.c;

class AnyClass3 {
	void anyMethod() {
		throw new NullPointerException(); // throw = 의도적인 예외 발생
	}
}

public class Ex3 {

	public static void main(String[] args) { // main에서도 예외를 처리하지 않으면 JVM이 예외 메시지만 띄우고 끝냄, 적어도 main에서는 예외처리를 해야함
		AnyClass3 ac = new AnyClass3();
		try {
		ac.anyMethod();
		}catch(NullPointerException e){
			
		}
	}

}
