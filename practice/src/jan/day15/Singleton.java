package jan.day15;

public class Singleton {
	//private 접근제한은 원본 클래스 내에서만 접근 가능 
	private static Singleton singleton = new Singleton(); //클래스 내부에서 생성된 인스턴스는 외부에서 접근 불가능하므로 Static을 붙여 접근할 수 있게 만들어줌
	
	private Singleton() {} // 생성자를 private로 생성하여 외부에서의 객체 생성을 막아버림
	
	public static Singleton getInstance() { // 이 클래스에 작성된 메소드만 사용 가능
		return singleton;
	}
	
}
