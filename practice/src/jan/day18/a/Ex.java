package jan.day18.a;

public class Ex {

	public static void main(String[] args) {
	//	Phone phone = new Phone(); // 인스턴스화가 안됨   
		Phone phone = new SmartPhone(100); // 상속한 클래스의 객체를 부모 클래스 타입의 객체로 생성할 수는 있다, 자식 클래스가 추상이면 마찬가지로 안됨 
		if (phone instanceof SmartPhone) { // 자식클래스의 객체를 업캐스팅해서 부모 클래스로 생성한 것이기 때문에 다운캐스팅 가능 
		SmartPhone sp = (SmartPhone) phone;
		System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		Phone phone1 = new SmartPhone2(100, 10);
		System.out.println(phone.x);
		
		//SmartPhone sp = (SmartPhone2) phone; // 자식끼리 강제캐스팅 불가능
		

	}

}
