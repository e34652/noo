package jan.designpatterns.abs;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CarFactory cF = null;
		System.out.println("생산하려는 차종을 선택 1: 국산차 2: 미국차");
		System.out.println("선택:");
		String key = scan.nextLine();
		switch (key) {
		case "1":
			cF = new KoreaCarFactory();
			break;
		case "2":
			cF = new StateCarFactory();
			break;
		default:
			System.out.println("다시 선택하세요");
			break;
		}
		TireProduct tP = cF.createTire();
		DoorProduct dP = cF.createDoor();

		String tire = tP.makeAssemble();
		String door = dP.makeAssemble();
		System.out.println(tire);
		System.out.println(door);
	}
}
