package jan.day17.e;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent; // 이 코드의 목적은 객체 수정이 아니라 해당 객체를 통한 연산의 결과물을 다른 객체에 대입하는 것 << 객체는 그대로, 연산의 결과물만 대입   
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent; 
		System.out.println("method2 - Child로 변환 성공");
	}
	
	
	public static void main(String[] args) {
		//Parent parentB = new Parent(); //<< 부모 객체를 베이스로 생성 >> child로 형변환이 될 때 오류가 생길 가능성이 높음 
		Parent parentB = new Parent();
		if(parentB instanceof Child) { // instanceof << parentB가 Child 타입의 인스턴스라면~ 이라는 의미, 강제형변환이 가능하겠냐 = 다운캐스팅 되냐 (객체 instanceof 타입)
			method2(parentB);
		}else {
			System.out.println("변환 불가");
		}
		Parent parentA = new Child(); // 자식 객체를 베이스로 생성, 타입은 부모타입 >> child로의 형변환은 오히려 자연스러워지는 수순임 << 오류가 안생김
		method1(parentA);// 다운캐스팅 성공
		method2(parentA);// 객체 생성 당시에 부모 객체로 했으면 오류가 발생할 수 있음 
		
	}

}
