package jan.designpatterns.proxy;

public class Proxy implements ISubject {

	private RealSubject realSubject; // 의미 생각해보기, 다른 클래스 타입을 필드로 선언하고 
	
	public Proxy(RealSubject realSubject) { // 생성자에서 해당 클래스타입 객체를 매개값으로 받아와서 필드에 대입함
		this.realSubject = realSubject;
	}
	// 상속으로 치면 자식 클래스의 생성자에 다른 자식 클래스를 매개값으로 받아 필드에 대입해 놓는 것    
 
	@Override
	public void action() {//logging 기록(로그)를 남기는 것
		System.out.println("로깅...............");
		System.out.println("프록시 객체 액션"); 
		realSubject.action();
		System.out.println("로깅..............");
	}	
//프록시 ip 우회 << 나와 웹서버 중간에 있는 프록시 서버에 나의 요청을 남겨놓으면 프록시 서버가 대신 웹서버에 요청해주는 방식
	//웹 서버의 응답 또한 프록시 서버가 대신 받아 나에게 전해줌
}//프록시 패턴이란 이러한 개념을 객체지향 언어로 구현해 놓은 것
// 프록시란 내가 원하는 걸 다른 객체에게 대리를 맡기는 것, 익명성 
