package jan.day24.b;


public class Parent {

	void pMethod() {}
}

class Child extends Parent{

	@Override
	void pMethod() {
		// TODO Auto-generated method stub
		super.pMethod();
	}
	
}

class A { // 익명 자식객체를 필드로 선언
	void method1(Parent p) {} // p에 익명 자식 객체에 대한 참조값이 담겼는데 이래도 익명? << 예
	
	void method2() { // 익명 자식 객체를 메소드의 메개값으로 대입 << 업캐스팅됨
		method1(new Parent() {

			@Override
			void pMethod() {
				// TODO Auto-generated method stub
				super.pMethod();
			}
			
		});
	}
	
	Parent field = new Parent() { 

		@Override
		void pMethod() {
			// TODO Auto-generated method stub
			super.pMethod();
		}

	};

	void method() { //메소드 내부의 로컬 변수로 선언
		Parent var = new Parent() {

			@Override
			void pMethod() {
				// TODO Auto-generated method stub
				super.pMethod();
			}

		};
	}
}
