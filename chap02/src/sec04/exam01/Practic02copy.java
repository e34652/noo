package sec04.exam01;

import java.util.Scanner;

public class Practic02copy {
	
	public static void integrated(int num1, int num2, String op) {
		if(op.equals("+")) {
			int result = num1 + num2;
			System.out.println("덧셈 결과:" + result);
		}else if(op.equals("*")) {
			int result = num1 * num2;
			System.out.println("곱셈 결과:" + result);
		}
	}
	
	
	public static void multi(int num1, int num2) {// 곱하기 메서드 선언
	
		int result = num1 * num2;
		System.out.println("곱셈 결과:" + result);
	}
	
	public static void sum(int num1, int num2) { //더하기 메서드 선언 
		
		
		int result = num1 + num2;
		System.out.println("덧셈 결과:" + result);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수:");
		int n1 = scanner.nextInt();
		System.out.print("두번째 수:");
		int n2 = scanner.nextInt();
		
		sum(n1, n2);
		multi(n1, n2);
		integrated(n1, n2, "*");
	}
}
