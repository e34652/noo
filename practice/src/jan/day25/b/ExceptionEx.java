package jan.day25.b;

class MyClass1 {
	void method() throws MyException {
		//...
		throw new MyException("문곰문곰");
	}
}

public class ExceptionEx {

	public static void main(String[] args) {
		MyClass1 mc = new MyClass1();
		try {
			mc.method();
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
