package jan.day10;

import java.util.Scanner;

public class SoloEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int userCount = 0;
		int idNum = 0;

		boolean logInStatus = false;
		boolean run1 = true;

		Solo[] solo = new Solo[3];

		while (run1) {
	
			System.out.println("-----------------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.로그아웃 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택> ");
			
			int menuNum1 = Integer.parseInt(scan.nextLine());
			
			switch (menuNum1) {
			
			
			case 1: // 로그인
				if (logInStatus) {
					System.out.println("이미 로그인 중입니다");
					break;
				}else if(userCount == 0) {
					System.out.println("먼저 회원가입을 해주세요");
					break;
				}
	
				System.out.println("ID를 입력해주세요");
				String inputId = scan.nextLine();
				
				System.out.println("PW를 입력해주세요");
				String inputPw = scan.nextLine();
				
				for (int i = 0; i < solo.length; i++) {
					if (inputId.equals(solo[i].id)) {
						if (inputPw.equals(solo[i].pw)) {
							System.out.println("로그인 성공");
							logInStatus = true;
							idNum = i;

							break;
						}
					}
				}
				
				System.out.println("회원 정보를 확인해주세요");
				break;

			case 2: // 회원가입
				if (logInStatus) {
					System.out.println("로그아웃 후 시도해 주세요");
					break;
				}
				
				

				System.out.println("회원가입을 시작합니다");
				solo[userCount] = new Solo(); 
				
				System.out.println("사용하실 ID를 입력해주세요");
				solo[userCount].id = scan.nextLine();

				System.out.println("사용하실 PW를 입력해주세요");
				solo[userCount].pw = scan.nextLine();

				System.out.println(solo[userCount]);

				userCount += 1;

				break;

			case 3:// 은행업무
				if (!logInStatus) {
					System.out.println("로그인이 필요합니다");
					break;
				}
				boolean run2 = true;
				while (run2) {

					System.out.println("-------------------------------------");
					System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.초기화면");
					System.out.println("-------------------------------------");
					System.out.print("선택> ");
					
					int menuNum2 = Integer.parseInt(scan.nextLine());

					switch (menuNum2) {

					case 1:
						System.out.println("현재 잔고: " + solo[idNum].balance);
						System.out.println("얼마를 예금하시겠습니까?\n 금액: ");
						
						solo[idNum].balance += Long.parseLong(scan.nextLine());

						System.out.println("예금 후 잔액: " + solo[idNum].balance);
						break;
					case 2:
						System.out.println("현재 잔고: " + solo[idNum].balance);
						System.out.println("얼마를 출금하시겠습니까? \n 금액: ");
						
						solo[idNum].balance -= Long.parseLong(scan.nextLine());

						System.out.println("출금 후 잔액: " + solo[idNum].balance);
						break;
					case 3:
						System.out.println("현재 잔고: " + solo[idNum].balance);
						break;
					case 4:
						System.out.println("초기 화면으로 돌아갑니다");
						run2 = false;
						break;
					}
				}
				break;
			case 4:// 로그아웃
				if (!logInStatus) {
					System.out.println("이미 로그아웃 상태입니다");
					break;
				}

				System.out.println("로그아웃 되었습니다");
				logInStatus = false;

				break;

			case 5:// 종료
				System.out.println("종료합니다");
				run1 = false;
				break;
			}

		}
	}
}
