package jan.day12;

public class Car2 {
//필드
	int speed;
	
//생성자
	
//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() { // 필드와 관련없는 메소드는 굳이 해당 클래스에 있을 필요가 없음, 클래스와 연관성이 있는 메소드를 작성하는 것이 좋은 코드 
		System.out.println("시동이 켜집니다\n현재 속도: " + speed + "km");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다(시속:" + speed + "km/h)");
		}
	}
}
