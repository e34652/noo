package jan.day15;

public class Week { // 열거타입이 없던 시절 그 기능을 구현하던 방법

	public static final int MONDAY = 1; // static final = 상수 선언
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THIRSDAY = 4;
	public static final int FRIDAY = 5;
	
	public static void main(String[] ar) {
		int day = Week.MONDAY;
	}
}
