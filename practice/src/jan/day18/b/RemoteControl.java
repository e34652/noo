package jan.day18.b;

public interface RemoteControl { 
	public static final int MAX_VOLUME = 10; // public static final 이 기본임
	int MIN_VOLUME = 0; // public static final이 있는 것과 같음 << 상수 = static final, 열거타입 = 퍼블릭
	
	public abstract void turnOn(); // public abstract가 기본임 << 이 인터페이스를 따르는 모든 클래스가 같은 규칙, 계약에 따라 확장하도록 하기 위해 같은 제목의 메서드로 재정의하도록 함   
	void turnOff(); // abstract = 규격, 통제 
}

//국법 제정, 법은 모두가 알 수 있어야 하며(public) 아무나 수정할 수 없으며(static final) 국가에 속한 모두가 지켜야할 의무가 있음(abstract)
//규칙을 정의해 다양한 사람들이 협업을 할 때 서로의 코드를 알아볼 수 있도록 공통된 일관성을 제공함
//implements 는 의무를 상속하는 느낌이라고 말할 수 있나?

//모두가 같은 변수를 사용해야하므로 무조건 상수정의하기 때문에 static final이 기본이며 변수 선언이 불가능하다  
//인터페이스는 클래스들 간의 계약, 규칙을 정의하므로 이를 따르는 클래스들이 해당 인터페이스의 모든 멤버를 구현할 수 있어야 하기 때문에 public이 강제된다 << 열거타입과 비슷함
//추상화 메소드는 유산을 물려주는게 아닌 빚을 물림하는 것과 같다 
//인터페이스에는 주로 추상메소드가 정의됨 
