package jan.day18.c;

public class MyClass implements InterTest{

	//test1메서드를 오버라이드 하지 않아도 됨
	
	
	//test04는 private이므로 재정의를 할 수가 없음 << 호출 불가능
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		InterTest.test5(); // static << 객체생성 없이도 가능 
		InterTest it = new MyClass(); 
		it.test1();
		

	}

}
