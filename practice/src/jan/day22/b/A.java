package jan.day22.b;

public class A {
	static int field3; // static 가능
	class B{
		B(){}
		int field1;
		//static int fied2; static 불가능 
		//스태틱 멤버는 클래스를 통해서 접근할 수 있어야 하는데 B의 객체 생성이 안된 상태에서 접근할 수 없어야 정상  
		//클래스는 로딩 즉시 메모리에 로드되는데 중첩클래스의 경우는 클래스가 인스턴스 화 될 때 이루어짐 
		void method1() {}
		//static void method2() {} 안됨
	}
	void methodA() {
		B b = new B(); // 이처럼 따로 클래스를 생성할 필요 없이 편리하게 사용 가능  
		b.field1 = 3;
		b.method1();

	}
}
