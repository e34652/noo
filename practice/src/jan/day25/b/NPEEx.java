package jan.day25.b;

class MyClass{
	void method() {}
}

public class NPEEx {

	public static void main(String[] args) {
		MyClass mc = null;
		System.out.println(mc);
		mc.method(); // mc라는 변수에 참조값이 없기 때문에 mc를 통해 MyClass의 메소드를 호출할 수 없음
		
//		String data = null;
//		System.out.println(data.toString()); // String 객체를 참조하지 않기 때문에 toString이 불가능

	}

}
