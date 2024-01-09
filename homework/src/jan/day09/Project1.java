package jan.day09;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		boolean run2 = true;
		boolean logInStatus = false;
		
		Account acc = null;
		
		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				System.out.println("로그인");
				
				System.out.print("입력하신 ID: ");
				String inputid = scanner.nextLine();
				
				System.out.print("입력하신 PW: ");
				String inputpw = scanner.nextLine();
				
				if (inputid.equals(acc.id)) { // 로그인 성공여부
					if (inputpw.equals(acc.pw)) {
						System.out.println("로그인 성공");
						logInStatus = true;
						break;
					}else {
						System.out.println("비밀번호가 일치하지 않습니다");
						break;
					}
				}else {
					System.out.println("일치하는 ID가 없습니다");
				}
				break;
			case 2:
				// 회원 가입
				System.out.println("회원 가입");
				
				System.out.print("사용하실 ID를 입력해주세요");
				String id = scanner.nextLine();
				
				System.out.print("사용하실 PW를 입력해주세요");
				String pw = scanner.nextLine();
			
				acc = new Account(id, pw);
				System.out.println(acc);
				
				break;
			case 3:
				// 예금 출금
				System.out.println("예금 출금");
				while (run2) {
					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					int menuNum2 = Integer.parseInt(scanner.nextLine());
					switch (menuNum2) {
					case 1:
						System.out.print("예금액> ");
						acc.balance += Long.parseLong(scanner.nextLine());
						break;
					case 2:
						System.out.print("출금액> ");
						acc.balance -= Long.parseLong(scanner.nextLine());
						break;
					case 3:
						System.out.print("잔고> ");
						System.out.println(acc.balance);
						break;
					case 4:
						run2 = false;
						break;
					}
					System.out.println();
				}
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
