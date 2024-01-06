package sec03.exam01;

import java.util.Scanner;

public class sum3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt(); 
		int sum = 0;
		for(int i = start; i<=end; i++) {
			sum += i; //계산(누적)
		}
		System.out.printf("%d부터 %d까지의 합은 %d",start,end,sum);
	}

}
