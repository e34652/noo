package sec02.exam01;

public class CaeEx {

	public static void main(String[] args) {
		//객체 생성
		//public Car()를 끌어옴
		// 각각의 필드는 객체의 성격을 상징함
		
		Car car3 = new Car("현대", "코나", "v3", 200, 100); // 객체 생성과 동시에 필드의 값을 정의, 가장 일반적인 객체 생성
		System.out.println(car3);
		
		//아래의 매개변수에 해당 값을 대입
		/*public Car(String company, String model, String color, int maxSpeed, int speed) {//필드를 초기화하는 생성자
			this.company = company; // this. 뒤에 오는 이름은 필드임을 가르킴
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed;
			this.speed = speed;
		}*/

		
		
		
				
		Car car1 = new Car(); // 객체 생성시 클래스에서 미리 정의된 필드를 초기화함(생성자를 이용해 불러옴)
		System.out.println(car1);	
		
		Car myCar = new Car();// 객체를 생성한 후 필드를 정의
		myCar.company = "KIA";
		myCar.color = "red";
		myCar.model = "K7";
		myCar.maxSpeed = 200;
		myCar.speed = 80;
		System.out.println(myCar);	
		
		
	}
}


