package sec02.exam01;

public class OperatorEx {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		int result1 = ++x + 10; // x = x + 1, 2 + 10
		int result2 = y++ + 10; // 1 + 10, y = y + 1
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("x: " + x + ", y: " + y);

		int num = 10 % 3; // 10을 3으로 나눈 나머지
		System.out.println(num);

		boolean play = true;
		System.out.println(!play); // ! = 논리값(true false)이 반대가 됨

		byte b = 100 + 10;
		// byte result = -b; // = -1 * b 변수연산이므로 결과값이 int 타입이므로 byte 타입 변수에 대입할 수 없다

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {// 2의 배수
				System.out.println(i);
			}
		}
		for (int i1 = 0; i1 < 10; i1++) {
			char c1 = (char) ('A' + i1); // 'A'는 char 타입의 리터럴으로 값은66이다. 따라서 리터럴 연산이다
			System.out.println(c1);
		}
		System.out.println("-------------");
		String str = "JDK" + (3 + 3.0);
		System.out.println(str);
		System.out.println(65<66);
		int num2 = 'B' - 'A';
		System.out.println(num2);
	}
}
