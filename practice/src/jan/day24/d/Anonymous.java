package jan.day24.d;

public class Anonymous {
	Person field = new Person(){
		void work() {
			System.out.println("출근");
		}

		@Override
		void wake() {
			System.out.println("6시 기상");
			work();
		}
		
	};
	
	void method1() { //익명 객체 = 클래스가 없는 객체
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책");
			}

			@Override
			void wake() {
				System.out.println("7시 기상");
				walk(); 
			}
		};
		localVar.wake();
	}
	
	
	void method2(Person person) { // Person 타입 
		person.wake();
	}
	
}
