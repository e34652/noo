package jan.day11;

public class PassingEx1 {

	public static void main(String[] args) {
//		YourClass yc3 = null; << 객체의 생성은 new 연산자를 통해 생성자가 실행될 때 일어나고 그때 해당 객체의 주소가 생긴다
//		yc3.x = 200;  << 따라서 아직 YourClass를 참조한 yc3이라는 객체는 아직 생성이 되지 않아 주소가 없기 때문에 nullpointexception이 생김

		
		YourClass yc = new YourClass(); // 객체 생성(기본생성자 실행)
		System.out.println(yc.x);
		method1(yc);
		System.out.println(yc.x);
		YourClass yc1 = new YourClass();
		System.out.println(yc1.x); // 같은 기본생성자가 실행되어 만들어진 객체가 다른 주소를 가짐을 알 수 있다 << new 연산자 때문
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