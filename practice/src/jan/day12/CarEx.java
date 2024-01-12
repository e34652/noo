package jan.day12;

public class CarEx {
	public static void main(String[]args) {
		Car myCar = new Car();
		
		myCar.setGas(5); // setGas()메소드 호출
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run(); // run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) { //isLeftGas()  메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다");// 위에서 run() 메소드를 실행하기 때문에 true값이 리턴되지 않아 출력될 수 없음
		}else {
			System.out.println("gas를 주입하세요");
		}
	}
}
