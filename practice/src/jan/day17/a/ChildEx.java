 package jan.day17.a;

public class ChildEx {

	public static void main(String[]args) {
		Child child = new Child();
		//Parent parent1 = new Child(); // 업캐스팅 
		
		Parent parent4 = new Child(); // 업캐스팅 가능
		//Child child4 = new Parent(); // 반대는 안됨 << 찬물도 위아래가 있음   
		
		Parent parent = child; // 자동 타입 변환을 통해 child의 참조값을 대입 Child 타입의 변수지만 Parent 타입 변수에 대입이 가능하다 << 업캐스팅
		parent.method1();
		parent.method2();	
		// parent.method3(); 업캐스팅의 한계, 같은 주소를 참조하더라도 부모 클래스에 없는 멤버는 사용할 수 없다   
	}
}//자동타입 변환이라고 하지만 사실상 데이터의 양은 자식 클래스가 더 많고 변환 과정에서 부모의 데이터 만큼만 가져다 쓸 수 있음  
// 자동으로 변환이 될 뿐이지 모든 데이터를 가져올 수는 없음 
//상속 족보에 있나 없나 단순히 타입을 확인하는 느낌 이며 참조값만 바뀌므로 데이터의 손실이 일어나는 것은 아니며 자식 클래스에서 오버라이딩 된 멤버를 쓸 수 없는것은 부모 타입의 범위안에 없는 데이터이기 때문   
