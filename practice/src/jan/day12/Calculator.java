package jan.day12;

public class Calculator {

	private int plus(int x, int y) {// private = 내부접근 가능, 외부접근 불가능
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { // 외부에서 직접 호출해 실행 가능
		double sum = plus(x,y); //execute 메소드로부터 호출됨 << 내부 호출
		double result = sum / 2;
		println(""+result);
		return result;
	}
	
	void execute() { // 외부에서 호출되어 실행되는 메소드
		double result = avg(7, 10); // avg를 plus로 바꾸어 덧셈을 수행할 수도 있음, double > int 
		println("실행결과: " + result); // println 메서드를 호출해 출력, 문자열 + 실수 연산을 통해 String으로 만들어 타입 일치
	}

	void println(String message) { // 호출되어 입력받은대로 출력하는 메소드
		System.out.println(message);
	}
}
