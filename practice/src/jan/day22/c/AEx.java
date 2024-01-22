package jan.day22.c;

public class AEx {

	public static void main(String[] args) {
		A.C.field2 = 3; // static 멤버는 객체 생성 전 사용 가능 
		A.C.method2(); // static 멤버는 객체 생성 전 사용 가능

		A.C c = new A.C(); // static class 이므로 객체 생성 없이 직접적으로 접근 가능 
		// 외부 클래스는 스태틱 취급이므로 내부 클래스만 static으로 해도 바로 생성자 호출하여 변수 생성 가능 
		//C 클래스의 멤버만 사용 가능
		c.field1 = 3;
		c.metod1();
	}
}
