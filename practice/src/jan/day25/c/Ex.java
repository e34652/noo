package jan.day25.c;

class AnyClass {
	void anyMethod() throws Exception {

	}

	void method() throws Exception {
		this.anyMethod();
	}
}

public class Ex {

	public static void main(String[] args) { // main에서도 예외를 처리하지 않으면 JVM이 예외 메시지만 띄우고 끝냄, 적어도 main에서는 예외처리를 해야함
		try {
			AnyClass ac = new AnyClass();
			ac.anyMethod();
		} catch (Exception e) {

		}

	}

}
