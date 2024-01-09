package sec02.exam01;

public class Car {
	//필드
	String company = "hyundai"; // 각각의 필드는 객체의 속성을 상징함
	String model = "k3";
	String color = "red";
	int maxSpeed = 300;
	int speed = 50;
	
	public Car() { //클래스에 생성자가 있기 때문에 다른 클래스에서 가져다 쓸 수 있음, 생성자에도 실행문을 작성할 수 있음
		System.out.println("Car()");
	}
	
	public Car(String company, String model, String color, int maxSpeed, int speed) {//필드를 초기화하는 생성자
		this.company = company; // this. 뒤에 오는 이름은 필드임을 가르킴
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}


	@Override
	public String toString() {//객체를 문자열로 만드는 메서드,오버라이딩하여 객체의 내용을 원하는 형식으로 변환, 일반적으로 객체의 필드 값을 문자열로 조합함
	    return "자동차 [회사=" + company + ", 색상=" + color + ", 모델=" + model + ", 최대속도=" + maxSpeed + ", 속도=" + speed + "]";
	    
	}
}
