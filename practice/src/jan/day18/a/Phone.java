package jan.day18.a;

public abstract class Phone {
	int x;
	
	public Phone(int x) {
		super();
		this.x = x;
	}
	
	//public void ring(); 추상 클래스이기 때문에 일반 메소드를 선언할 수 없음
	
	public abstract String ring(int tel); // 반대로 일반 클래스에는 추상 메소드를 선언할 수 없음
	
}
