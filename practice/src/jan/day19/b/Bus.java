package jan.day19.b;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스 달린다");
		
	}
	public void checkFare() {
		System.out.println("승차 요금 체크합니다");
	}
	
}
