package jan.day16;

public class ConstructorEx {

	class A {
		public A() {
			super(); // Object
			System.out.println("생성자A");
		}
	}

	class B extends A {
		public B() {
			super();
			System.out.println("생성자B");
		}
	}

	class C extends B {
		public C() {
			super();
			System.out.println("생성자C");
		}
	}

	public static void main(String[] args) {
		C c;
		//c = new C();
	}
}