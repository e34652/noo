package jan.day19.b;

interface InterA{
	void method();
}

public class ClassA implements InterA{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

}
class ClassB extends ClassA{
	public static void main(String[]args) {
		InterA itA = new ClassB();
	}
}

// implements 구현된 부모 클래스를 상속하면 어떻게 되나  
// 부모의 부모이니 가능함 (implements는 양부모 느낌) 

