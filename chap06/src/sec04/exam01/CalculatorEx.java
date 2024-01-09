package sec04.exam01;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result1 = cal.plus(100, 200);
		System.out.println(result1);

		double result2 = cal.plus(3.14, 0.59);
		System.out.println(result2);

	}

}
