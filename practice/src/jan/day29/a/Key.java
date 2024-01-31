package jan.day29.a;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) { // 매개변수의 다형성(Object로부터 상속)
		if (obj instanceof Key) {// Key 클래스의 객체인지 확인
			Key compareKey = (Key) obj;// Key 클래스 변수에 대입
			if (this.number == compareKey.number) { // number비교
				return true;
			}
		}

		return false;
	}

	@Override
	public int hashCode() {

		return number;
	}

}
