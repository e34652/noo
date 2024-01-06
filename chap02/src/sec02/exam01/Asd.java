package sec02.exam01;

import java.util.Scanner;

public class Asd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String strAnswer;
		int num1 = (int) (Math.random()*10 + 1);
		int num2 = (int) (Math.random()*10 + 1);
		
		System.out.printf("%d * %d = ?  Q = 종료 / R = 다른 문제 \n답은? ", num1, num2);
		while(true) {
			strAnswer = scanner.nextLine();
			if(strAnswer.equalsIgnoreCase("Q")) {
				System.out.println("종료");
				break;
			}else if(strAnswer.equalsIgnoreCase("r")) {
				num1 = (int) (Math.random()*10 + 1);
				num2 = (int) (Math.random()*10 + 1);
				System.out.printf("%d * %d = ?  Q = 종료 / R = 다른 문제 \n답은?", num1, num2);
				continue;
			}else{
				int answer = Integer.parseInt(strAnswer);
				if(answer==num1*num2) {
					System.out.println("정답!!  Q = 종료 / R = 다른 문제\n");
					continue;
				}
			}
		}
	}
}