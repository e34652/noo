package jan.day22.e;

public class AEx {

	public static void main(String[] args) { //나중에 주석 붙이며 복습 총정리
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();

		A.C.field2 = 3;
		A.C.method2();
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		a.method();
	}

}
