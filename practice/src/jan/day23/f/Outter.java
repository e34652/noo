package jan.day23.f;

public class Outter {
	static String str = "static - str";
	String field = "Outter-field";

	void method() {
		System.out.println("Outter-method");
	}

	class Nested {
		String field = "Nested-field";

		void method() {
			System.out.println("Nested-method");
		}

		void print() {
			System.out.println(Outter.str);
			System.out.println(this.field);
			System.out.println(Outter.this.field);
			this.method();
		}
	}
}
