package jan.day11;

public class PassingEx {

	public static int method1(int y) {// 함수, 메소드(코드가 순차적으로 실행되는 공간)
		int a = y;
		System.out.println(3);
		method2();
		return a;
	}
	
	public static void method2() {
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		int num = method1(123);
		System.out.println(num);
		method1(13); // 호출된 메서드를 실행하고 리턴을 마지막으로 호출했던 자리로 돌아와 다시 실행흐름을 이어감(리턴타입이 void면 return생략 가능)
		System.out.println(num);
	}
}
