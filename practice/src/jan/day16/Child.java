package jan.day16;

class Parent2{
	
}
class Parent{ // 부모 클래스
	int money = 100; // 물려줄 요소
	
	void disp() {
		System.out.println(money);
	}
}

public class Child extends Parent/*, Parent2 << 다중 상속 금지*/ { // 자식 클래스
	public Child(){ // 생성자
		this.money +=300; // 부모 클래스에 있는 필드를 상속함 100 += 300
	}
	
	public static void main(String[]args) {
		Child ch = new Child();
		ch.disp(); // 부모 클래스에 있는 메소드를 상속함
//		System.out.println(ch.money);
	}
	
}
