package jan.day22.aa;

public class Aa { 
	B field1 = new B(); //인스턴스 멤버 클래스까지는 메모리 할당이 클래스 로딩시 되는데
	C field2 = new C(); //왜 로컬 클래스는 안되는 것인지 외부 클래스의 멤버 레벨이 아닌것인가
	// 멤버 클래스의 객체를 해당 클래스의 필드로 쓴 모습 
	
	//static B field3 = new B(); 
	// B클래스는 A객체가 생성된 후에 접근이 가능하므로 스태틱 필드에서 사용 불가능 
	
	static B field3 = new Aa().new B(); 
	// A 객체 생성 후 B 객체 생성 가능, 그렇다면 A는 익명 객체가 되는가  
	
	static C field4 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	static void method2() {  // 왜 스태틱 메소드이면 아래의 객체가 생성이 안되는걸까 
		
		//B var1 = new B();
		//스태틱 메소드이건 말건 내부 클래스의 객체 생성은 외부 클래스를 통해 접근해야함 
		//왜 메소드 스태틱 블록 안에서는 A.B()가 안되는가 << 아래에 답변 적어둠

		//B var2 = new Aa.B(); 
		// 스태틱 메소드는 Aa클래스의 객체 생성 없이 바로 사용(호출)될 수 있음
		// 그러한 경우 이 코드대로 실행된다면 외부클래스(Aa)의 객체생성 없이 인스턴스멤버클래스(B)에 접근하는 꼴이 됨   
		
		B var3 = new Aa().new B(); // 
		//이 코드는 외부클래스(Aa)의 객체가 생성되기 전에 호출되어도 
		//Aa의 객체를 생성한 후 B를 생성하므로 이 코드대로 실행할 경우 문제가 없음 
		//해당 코드가 실행되는 시점에서 어떤 상태인지를 잘 생각해야함
		
		//그렇다면 생성된 Aa 객체는 익명 객체가 된다
		//상속도 자식 클래스에서 호출된 부모 클래스의 생성자로 만들어진 객체는 익명객체 이지만 족보가 확실함 
		
		C var4 = new C();
	}
	
	class B{
		void method12() {}
	}
	
	
	
	static class C{}
	
}
