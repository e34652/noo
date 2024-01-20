package jan.designpatterns.abs;

public class KoreaCarFactory extends CarFactory {
	
	void test() {
		TireProduct tp = new KoreaTireProduct(); // 추상 클래스 객체로 업캐스팅 가능 
	}

	@Override
	public DoorProduct createDoor() {// 추상 클래스 타입을 반환하도록 하여 다형성을 구현함
		return new KoreaDoorProduct(); 
	} 

	@Override
	public TireProduct createTire() {
		return new KoreaTireProduct();
	}




}
