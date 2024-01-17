package jan.day17.d;

public class ChildEx {

	public static void main(String[]args) {
		Parent parent = new Child();// Child 타입은 부모의 멤버를 상속받아 field 1을 사용할 수 있지만 Parent 타입 변수이기 때문에 자식 클래스의 멤버는 사용할 수 없다
		parent.field1= "data";
	
			
		parent.method1();
		parent.method2();	
		
//		parent.field2 = "data";
//		parent.method3();
		
		Child child = (Child) parent; // << 다운캐스팅, 강제 타입 변환이므로 데이터 손실과 에러가 날 수 있지만 문법상 오류는 없음 
		child.field2 = "data"; // 업캐스팅은 참조값만 바꿀 뿐이라 데이터 손실이 없는 반면  다운캐스팅은 강제 타입 변환이므로 손실이 일어날 수 있음 
		child.method3();// 강제 타입 변환이라고 하지만 사실상 원래 상태로 돌아간 것일 뿐임
	}
}