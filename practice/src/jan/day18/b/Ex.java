package jan.day18.b;

public class Ex {
	
	public static void main(String[] args) {
		RemoteControl rc = new Audio(); // 업캐스팅인지 아니면 new Audio의 객체는 Remote Control의 규칙을 따른다 인지
		//RemoteControl rc1; rc = new Audio(); << 합치면 윗줄과 같음 
		rc.turnOn();
		System.out.println(rc.MAX_VOLUME);;
		//rc.MAX_VOLUME = 100; << 상수이므로 변경할 수 없음 (final)
	}
}
