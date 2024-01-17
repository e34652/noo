package jan.day17.c;

public class Driver {
	public void drive(Vehicle vehicle) { // 매개변수로 Vehicle 타입의 변수를 받을 예정
		vehicle.run();  //객체도 아니고 static 메소드도 아니라 실행하지 않는 그저 설계도일 뿐이므로 컴파일 단계에서는 에러가 생기지 않음 나중에 객체를 생성해 매개값으로 넘겨주면 그만 
	}
}

