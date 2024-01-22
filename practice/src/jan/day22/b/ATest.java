package jan.day22.b;

public class ATest {

	public static void main(String[] args) {
		A a = new A(); // 외부 클래스의 생성자가 실행되어도 B는 생성되지 않음 
		//A.B b = a.new B(); // A가 생성되면 그 내부에 있는 B의 생성자를 불러올 수 있음   
		
		
		//A.B b = new A().new B(); 
		//b.field1 = 3;
		//b.method1();
		
	}

}
