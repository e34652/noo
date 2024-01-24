package jan.day23.c;

public class A {
	int field1;
	void method1() {
		System.out.println("method1()");
	}
	
	
	class B{ // 바깥이 생성되어야 안이 생성됨, 중첩 = 종속
		void method() {
			field1 = 10;
			//this. << class B를 가르킴 
			method1();
			System.out.println("method() ," + field1);
		}
	}
	public static void main(String[] args) {// static = 즉시 전투가 가능한 부대, 전투가 불가능한 병력은 편성될 수 없다 
		A a = new A();
		B b = a.new B(); // 안됨 A의 객체가 필요함
		//B b = new A().new B(); 위의 두줄을 한번에, 이때 생성되는 A는 익명객체이므로 A의 멤버를 사용할 수 없다  
		
		b.method();
		
	}
}
