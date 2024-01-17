package jan.day17.g;

public abstract class Animal { // 추상 클래스
	String kind;
	
	public void breadthe() {
		System.out.println("숨을 쉰다");
	}
	
	public abstract void sound();// 추상 메소드 << 추상 메소드는 상속될 때 반드시 재정의 되어야함
}// Animal을 상속하는 모든 클래스들은 추상 메소드를 재정의 해야한다
