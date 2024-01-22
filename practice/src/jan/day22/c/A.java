package jan.day22.c;

public class A {
	static class C{
		C(){}
		int field1;
		static int field2;
		void metod1() {}
		static void method2() {}
	}
	
	void methodA() {
		C.field2 = 10; // 객체 생성 전에도 사용 가능 
		C c = new C();
		c.field1 = 3;
		//c.field2 = 10;
		C.field2 = 10; // 클래스 C를 직접적으로 사용 
	}
}
