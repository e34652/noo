package jan.day22.d;

public class LocalClass {

	void method() {
		class D{
			D() {}
			int field1;
			//static int field2; // 로컬 클래스 내부에 스태틱 멤버는 만들 수 없음
			void method1() {}
			//static void method2() {} // 마찬가지로 안됨
		}
		D d = new D(); // 중첩 로컬 클래스가 선언된 메소드 블록 내에서 사용 가능 
		d.field1 = 3;
		d.method1();
	}
}
