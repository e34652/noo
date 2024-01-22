package jan.day22.e;

public class A { // << 외부 클래스

	A() {// 생성자
		System.out.println("A 객체 생성");
	}

	class B { // << 내부 클래스 = 멤버 클래스
		B() {// 생성자
			System.out.println("B 객체 생성");
		}
		
		int field1;

		// static int field2; << 스태틱 멤버 클래스면 가능하지만 인스턴스 멤버 클래스는 안됨
		void method1() {
		}
		// static void method1() {} << 마찬가지로 안됨
	}

	static class C { // << 스태틱 멤버 클래스
		C() {// 생성자
			System.out.println("C 객체 생성");
		}

		int field1;
		static int field2;

		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		// D d new D(); << 로컬 클래스는 클래스인데 어째서 메소드의 실행 흐름을 따르는가 
		// 클래스 > 멤버 > 멤버클래스 , 멤버에 종속되는 것인가 = 멤버보다 하위 레벨?   
		class D { // 로컬 클래스 << 메소드 블록 속에 선언
			D() { // 생성자
				System.out.println("D 개체 생성");
			}

			int field1;
			// static int field2; << 스태틱 멤버 클래스가 아님
			
			void method1() {

			}
		}
		A.B b = new A.B(); ////////////////////////// 질문포인트
		// A = 스태틱취급이므로 멤버클래스의 생성자까지 접근 가능, 그 이상은 해당 멤버 클래스의 객체 생성 후 가능 
		// B.field1 = 10; 인스턴트 멤버 클래스의 멤버는 해당 멤버 클래스의 객체 생성 후 접근 가능
		C.field2 = 10; // 스태틱 멤버 클래스의 스태틱 멤버는 바로 접근 가능 
		D d = new D(); // 로컬 클래스는 선언된 메소드 블록을 벗어나면 접근 불가능
		d.field1 = 3;
		d.method1();
	}
	//D dd = new D(); 로컬 클래스는 선언된 메소드 블록을 벗어나면 접근 불가능
}