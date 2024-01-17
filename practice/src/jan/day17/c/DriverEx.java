package jan.day17.c;

import java.util.Scanner;

public class DriverEx {

	public static void main(String[] args) { // 매개 변수를 통해 실행 결과의 다형성을 
		Driver driver = new Driver();
		driver.drive(new Bus()); // Vehicle 타입의 자식 클래스를 업캐스팅하여 매개값으로 입력
		driver.drive(new Taxi());// Vehicle 타입의 자식 클래스를 업캐스팅하여 매개값으로 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("이동할 교통 수단을 선택하세요(1:버스, 2:택시)");
		System.out.println("번호: ");
		int num = Integer.parseInt(scan.nextLine());
		Vehicle vehicle = null; // 같은 코드로 다른 결과를 얻기위해 bus와 taxi의 공통된 부모 클래스인 vehicle 타입의 변수를 사용해 다형성을 향상  
		switch(num) { // 매개변수에 매개값으로 무엇을 입력하느냐에 따라 달라지는 결과
		case 1:
			vehicle = new Bus(); //(업캐스팅) << 자식 객체를 생성후 부모 클래스에 대입
			break;
		case 2:
			vehicle = new Taxi(); //(업캐스팅) << 자식 객체를 부모 클래스에 대입
			break;
		default:
			break;
			
		}// 다형성을 통해 비슷한 코드의 반복을 간소화 시킬 수 있음
		driver.drive(vehicle); 
	}

}
