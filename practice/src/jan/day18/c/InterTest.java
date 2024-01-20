package jan.day18.c;

public interface InterTest {
	void test(); // 추상메소드 (abstract 생략)
	default void test1() {//default 메소드를 만든 이유 << 강제적으로 재정의하지 않아도 되므로 모든 클래스가 아닌 내가 원하는 클래스에서만 재정의 할 수 있음 
		//default 가 없다면 인터페이스를 확장할 때마다 모든 클래스가 다 바뀌어야해서 인터페이스 확장이 어려움 
		System.out.println("test1()");
	}
	
	default void test3() {
		test4(); // 인터페이스 내부에서만 호출 가능
	};
	
	private void test4() { //private 메소드를 만든 이유?
		System.out.println("test4()");
	};
	
	static void test5() {
		System.out.println("test5()");
	}
}


//static  << public과 private 둘다 선언 가능, 인터페이스를 구현한 클래스 내에서 스태틱 메소드와 똑같이 작용함  
//default << public으로만 선언 가능, abstract에서 강제성을 뺀 메서드, 메서드 내용 정의 가능 
//private << 인터페이스 내에 있는 다른 메소드에 의해서만 호출 가능, 메서드 내용 정의 가능
