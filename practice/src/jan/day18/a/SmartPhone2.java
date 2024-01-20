package jan.day18.a;

public class SmartPhone2 extends Phone {
	int y;
	
	public SmartPhone2(int y, int x) {
		super(y); // 부모의 생성자 호출
		this.y = y;
	}
	
	public void printX() {
		System.out.println(x);
		
		
	}

	@Override
	public String ring(int tel) {
		// TODO Auto-generated method stub
		return null;
	}


}
