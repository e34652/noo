package jan.day23.b;


public class Account { 
	// 외부클래스 = 다른 객체와 공유하기 위함
	// 중첩클래스 = 최대한 노출하지 않고 간단하게 사용   
	
	Account acc = new Account(); // 필드는 순차적인 공간이 아니라 동시에 선언됨
	
	Name name = new Name();
	//static School school = new School(); // static은 즉시 사용이 가능해야하는데 school이 중첩 클래스가 될 경우 Account의 객체가 생성되어야 사용 가능하므로 
	School school = new Account.School(); // 이것처럼 클래스 객체 생성 후 하거나
	
	class Name{}
	static class School{} // 스태틱으로 만들거나 

}
