package sec01.ex01;

public class StaticEx {

	static int y; //정적 필드 
	
	public static void main(String[] args) {
		System.out.println(y);
		y = 300;
		System.out.println(y);
		//int x = 20; // 지역변수
		m1(y);
		//System.out.println(x);
	}
	public static void m1(int x) { // 매개변수 (지역 변수의 일종) // 다른 메소드에서 지역변수를 바꿔도 다른 메소드에 있는 지역 변수에는 영향이 없다
		System.out.println(x);
		x = 200;
		System.out.println(x);
		y=500; 
		System.out.println(x);
	}
}
