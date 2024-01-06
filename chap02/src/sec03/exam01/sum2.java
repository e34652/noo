package sec03.exam01;

import java.util.Scanner;

public class sum2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in); // 입력준비
		System.out.println("숫자 입력>"); //처리(UI)
		int num1 = Integer.parseInt(scanner.nextLine()); // 입력
		
		System.out.println("숫자 입력>"); //처리(UI):
		int num2 = Integer.parseInt(scanner.nextLine()); // 입력
		
		int sum = num1 + num2; // 계산
		System.out.printf("두 수의 합은 %d\n", sum); // 출력
		

	}

}
