package jan.day12;

class MyClass{
	void method1() {
		System.out.println("method1");
	}
	static void method2() {// 스태틱이므로 실행과 동시에 메소드 메모리에 등록되며 모든 객체가 공유하게 됨
		System.out.println("method2");
	}
	
}

public class StaticClass {
	static void method3() {
		System.out.println("method3");
	}
	public static void main(String[] args) {
		StaticClass.method3();
		MyClass.method2();// <<이렇게 호출하는 것이 정상적인 방식,이미 메모리(주소)를 할당받아 모든 객체가 공유하는 상태이므로 객체 생성없이 즉시 호출이 가능함
		MyClass a = new MyClass();
		a.method1();
		a.method2(); //올바른 호출 방식이 아니어도 컴파일러가 구현해줌
		 
		MyClass a1 = new MyClass();
		a1.method1();
		a1.method2(); //올바른 호출 방식이 아니어도 컴파일러가 구현해줌
		
	}

}
