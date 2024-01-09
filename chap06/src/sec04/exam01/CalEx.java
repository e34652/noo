package sec04.exam01;

public class CalEx {

	
	
	public static void main(String[] args) {
		//power(); Cal이 static으로 선언되지 않아 호출 불가능
		Cal.sx = 500; // 하나의 sx 값만 바꿔도 static 필드이기 때문에 모두가 공유함 
		Cal cal = new Cal();
		cal.power();
		cal.x = 100;  // static 필드가 아니기 때문에 값을 공유하지 않음
		cal.printX();
		
		Cal cal2 = new Cal();
		System.out.println(cal2.x); // new 연산자로 생성한 객체 cal에도 x변수가 존재함
		cal2.power();
	}

}
