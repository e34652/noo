package jan.day25.c;

class AnyClass2 {
	void anyMethod() throws ClassNotFoundException{
		throw new ClassNotFoundException(); // throw = 의도적인 예외 발생
	}
}

public class Ex2 {

	public static void main(String[] args) { // main에서도 예외를 처리하지 않으면 JVM이 예외 메시지만 띄우고 끝냄, 적어도 main에서는 예외처리를 해야함

		AnyClass2 ac = new AnyClass2();
		try {
			ac.anyMethod();
		} catch (ClassNotFoundException e) {
		
		}
		System.out.println("계속 실행 중");
	}

}
