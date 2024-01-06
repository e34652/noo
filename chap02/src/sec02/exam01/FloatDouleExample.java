package sec02.exam01;

public class FloatDouleExample {

	public static void main(String[] args) {
		float num1 = 123.1231234123412341234123423234f;
		double num2 = 123.1231234123412341234123423234;
		System.out.println(num1); 
		System.out.println(num2);
		
		double var = 0.1;
		for(int i = 0; i<100;i++) {
			var += 0.1;
		}
		System.out.println(var);
	}

}
