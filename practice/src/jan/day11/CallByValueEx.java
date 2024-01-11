package jan.day11;

public class CallByValueEx {

	public static void increase(int n, AnotherClass ac) {// int은 지역변수이므로 같은 n이 아님
		n += 1;
		System.out.println(n);
		ac.n += 1; 
		System.out.println(ac.n);
	}

	public static void main(String[] args) {
		int n = 100;
		AnotherClass ac = new AnotherClass();

		increase(n, ac); 
		// 기본타입은 Call by value 이므로 매개값으로 입력된 변수의 값을 복사해 호출된 메서드의 매개변수에 대입하므로 연동되지 않음 << 해당 값을 가진 새로운 변수 생성
		// 참조타입은 Call by reference 이므로 매개값으로 입력된 변수에 들어있는 객체의 주소를 넘겨줌 
		// 따라서 매개값으로 입력된 변수와 호출된 메서드의 매개변수가 같은 주소를 참고하게 되어 변경사항이 매개값으로 입력된 변수에도 반영됨
		
		System.out.println((n + "," + ac.n)); // 메소드의 실행결과값은 리턴이 되지만 이 메서드의 n값은 변하지 않음

	}

}

class AnotherClass {
	int n = 10;
}