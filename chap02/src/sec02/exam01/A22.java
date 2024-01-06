package sec02.exam01;

import java.util.Scanner;

public class A22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int L = 10;
		int num1;
		int num2;
		num1 = (int) (Math.random()*L + 1);
		num2 = (int) (Math.random()*L + 1);
		System.out.printf("%d * %d = ?\n답은?", num1, num2);
		int answer = scanner.nextInt();
		if(answer == num1 * num2) {
			System.out.print("정답!!");
		}else{
			while(answer != num1 * num2) {
				System.out.print("땡!! \n답은?");	
				answer = scanner.nextInt();
			}
			System.out.println("정답!!");
		}
	}	
}
