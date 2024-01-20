package jan.designpatterns.abs;

public abstract class CarFactory { // 자동차 생산 공정 규격을 정의 << 문 만들기, 타이어 만들기
	public abstract DoorProduct createDoor(); // 추상 클래스 타입을 리턴값으로 설정한 다형성지향 코드 
	public abstract TireProduct createTire();	


}
