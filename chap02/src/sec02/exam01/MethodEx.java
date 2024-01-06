package sec02.exam01;

public class MethodEx {

	public static void method(int x, int y) {// 메서드 정의
		// 메소드 제목은 소문자, static = 정적인 (객체지향 X)

		System.out.println(x + y);
	}

	public static int method2(int x, int y) {

		return x + y;
	}

	public static void main(String[] args) {

		method(100, 200); // 메서드 호출
		int ret = method2(300, 400);
		System.out.println(ret);
	}
}
