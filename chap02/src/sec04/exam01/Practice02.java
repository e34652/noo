package sec04.exam01;

import java.util.Scanner;

public class Practice02 {
	
	public static void multi(Scanner scanner) {
		System.out.print("첫번째 수:");
		int multiNum1 = scanner.nextInt();
		System.out.print("두번째 수:");
		int multiNum2 = scanner.nextInt();
		int result = multiNum1 + multiNum2;
		System.out.println("곱셈 결과:" + result);
	}
	
	public static void sum(Scanner scanner) { //정적(static) 메서드
		
		System.out.print("첫번째 수:");
		String strNum1 = scanner.nextLine();
		System.out.print("두번째 수:");
		String strNum2 = scanner.nextLine();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		sum(scanner);
		multi(scanner);

	}

}
