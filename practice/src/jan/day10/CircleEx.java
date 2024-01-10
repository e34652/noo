package jan.day10;

public class CircleEx {

	public static void main(String[] args) {
		Circle[] c; // Circle 클래스가 여러개 들어갈 수 있는 배열
		c = new Circle[5];// Circle 5개를 넣을 수 있는 방이 생성되고 객체 생성은 아직
		for (int i=0; i<c.length; i++) {
			c[i] = new Circle(i);// 객체 생성 c에는 Circle이 5개까지 들어갈 수 있음
		}// 클래스 = 참조타입, 배열 = 참조타입, 클래스배열 = 참조가 2번 일어남

		for(int i=0; i<c.length; i++) {
			System.out.println(c[i].getArea());
		}
	}

}
