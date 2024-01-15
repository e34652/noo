package jan.day15;

public class Cal {
	
	static int x;
	static int p1() {
		return x + 100;
	}
	static int m1() {
		return x - 100;
	}
	static void m2() {
		System.out.println(x);
	}
	public static void main(String[]args) {
		Cal ca = new Cal();
		ca.m2();// 정상적인 사용법이 아님 << static 메소드에 인스턴스를 통해 접근함
		Cal.m2(); // 이처럼 클래스를 통해 직접적으로 호출해야함
		
		x = 100;
		int y = p1();
		System.out.println(y);
		Cal.m2();
		
	}
}
