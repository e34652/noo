package jan.day11;

public class PassingEx1 {

	public static void main(String[] args) {
		YourClass yc = new YourClass(); // 객체 생성(기본생성자 실행)
		System.out.println(yc.x);
		method1(yc);
		System.out.println(yc.x);
		YourClass yc1 = new YourClass();
		System.out.println(yc1.x); // 같은 생성자로 만들어진 객체가 다른 주소를 가짐을 알 수 있다 << new 연산자 때문
		method1(yc1);
		System.out.println(yc1.x);
	}

	public static void method1(YourClass yc) {
		//System.out.println(yc);
		yc.x = 300;
		return;
		
	}
	
}

class YourClass{
	int x;
}