package jan.designpatterns.abs;

public class Ex {
	public static void main(String[] args) { 
		// 추상화가 필요한 이유, 규격을 통일한 후 추상화 클래스로 묶은 후 코드의 일부분만 바꿔도 다른 모든 객체를 통제할 수 있음 
		// 질서적인 확장을 강제하여 공통된 부분을 통제  조금씩만 다른 클래스들을 같은 규격으로 통일된 클래스의 객체를 활용한 메소드를 활용하는 클래스를 더 큰 설계를 할 때    
		// 하나의 객체를 이루는 구성객체들이 많아질수록 수정할 값이 기하급수적으로 늘어나는데 추상화를 통해 코드 한 부분만 바꿔서 모든 것을 관리할 수 있음 
	
	CarFactory carFactory = new StateCarFactory(); // << 미국산 차 공장으로 바꾸려면 여기만 바꾸면 됨
	TireProduct tP = carFactory.createTire();
	DoorProduct dP = carFactory.createDoor();
	
	String tire = tP.makeAssemble();
	String door = dP.makeAssemble();
	System.out.println(tire);
	System.out.println(door);
}
}