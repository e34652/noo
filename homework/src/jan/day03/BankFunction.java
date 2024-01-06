package jan.day03;

import java.util.Scanner;

public class BankFunction {
//예금 출금
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.println("선택> ");
			
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				System.out.printf("얼마나 예금하시겠습니까?");
				int money = scanner.nextInt();
				balance = balance + money;
				System.out.printf("예금액>%d\n\n", balance);				
				continue;
			}
			else if(choice == 2){
				System.out.printf("얼마나 출금하시겠습니까?");
				int money = scanner.nextInt();				
				balance = balance - money;
				System.out.printf("출금액>%d\n\n", balance);
				continue;
			}
			else if(choice == 3){
				System.out.printf("잔고>%d\n\n",balance);
				continue;
			}
			else if(choice == 4){
					break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
