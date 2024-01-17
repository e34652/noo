package jan.day17.b;

public class HankookTire extends Tire {
	// 필드

	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);

	}
	// 메소드

	@Override
	public boolean roll() {
		// return super.roll(); 코드가 안보여서 복붙 << 부모 메서드의 숨김효과
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");//오버라이드 후 타이어 이름만 수정 
			return false;
		}
	}
}
