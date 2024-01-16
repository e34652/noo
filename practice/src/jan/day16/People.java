package jan.day16;

public class People extends Object { // 모든 클래스의 근원 << extends Object 가 생략되어도 괜찮음 
	String name;

	public People() {
		
	}
	
	public People(String name) {
		//super(); // 모든 클래스는 Object로부터 상속받았다
		this.name = name;
	}
	void method1() {
	
	}
}
