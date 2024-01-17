package jan.day17.f;

public class Ex {
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		
		controller.setService(new MemberService()); 
		controller.service.login();  //MemberService 타입 객체로 로그인 << MemberService의 login 메소드
		
		controller.setService(new AService()); // 객체 생성과 동시에 매개값으로 넣음
		controller.service.login(); // 업캐스팅 된 MemberService 타입 객체로 로그인 << 오버라이딩 된 login메소드 실행, 업캐스팅은 자동으로 
		//매개변수의 다형성
		
	}	
}
