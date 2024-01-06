package jan.day03;

import java.util.Scanner;

public class Integration {

	public static String registration() {
		// 회원가입

		Scanner scanner = new Scanner(System.in);

		System.out.println("[회원 가입]");
		System.out.println("1. 사용할 ID: __________");
		System.out.println("2. 사용할 PW: __________");

		System.out.println("[입력한 내용]");

		String id = scanner.nextLine();
		System.out.println("ID : " + id);

		String pw = scanner.nextLine();
		System.out.println("PW : " + pw);

		String regIdPw = id + pw;
		return regIdPw;

	}

	public static String logIn() {
		// 로그인 입력한 ID PW를 리턴
		Scanner scanner = new Scanner(System.in);

		System.out.print("ID: ");
		String logInId = scanner.nextLine();

		System.out.print("PW: ");
		String logInPw = scanner.nextLine();

		String logInIdPw = logInId + logInPw;
		return logInIdPw;
	}

	public static long banking() {
		// 은행업무 업무 종료 후 남은 잔고 리턴
		boolean run = true;
		long balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------------------------");
			System.out.println("선택> ");

			int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.printf("얼마나 예금하시겠습니까?");
				long money = scanner.nextInt();
				balance = balance + money;
				System.out.printf("예금액>%d\n\n", balance);
				continue;
			} else if (choice == 2) {
				System.out.printf("얼마나 출금하시겠습니까?");
				long money = scanner.nextInt();
				balance = balance - money;
				System.out.printf("출금액>%d\n\n", balance);
				continue;
			} else if (choice == 3) {
				System.out.printf("잔고>%d\n\n", balance);
				continue;
			} else if (choice == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		return balance;	
	}
	

	public static void main(String[] args) {
		// 초기화면
		Scanner scanner = new Scanner(System.in);
		int nowLoading = 0; // 원하는 작업 선택 변수
		boolean logInStatus = false; // 초기값 = 로그아웃

		String userAccount = ""; // 유저 계좌 변수
		String userIdPw = ""; // 유저 ID/PW
		String inputIdPw = ""; // 

		long inputBalance = 0;

		while (true) {

			if (nowLoading == 0) {
				System.out.println("-------------------------------------");
				System.out.println("1.회원가입 | 2.로그인 | 3.은행업무 | 4.종료");
				System.out.println("-------------------------------------");
				System.out.println("선택> ");

				nowLoading = scanner.nextInt();
			}
			if (nowLoading == 1) {// 1번시 회원가입 절차 로딩
				userIdPw = registration();
				userAccount = userIdPw + "account";
				nowLoading = 0;

			} else if (nowLoading == 2) {// 2번시 로그인 절차 로딩
				inputIdPw = logIn();

				if (inputIdPw.equals(userIdPw)) {// ID/PW 일치하면 로그인상태
					logInStatus = true;
					System.out.println("로그인 성공");
					nowLoading = 0;
				} else {
					System.out.println("로그인 실패 다시 시도해주세요");
					nowLoading = 0;
				}
			} else if (nowLoading == 3 && logInStatus == true) {// 3번 + 로그인 = 은행업무 로딩
				inputBalance = banking();
				System.out.println("잔액: " + inputBalance);
				nowLoading = 0;
			}
			else if (nowLoading == 3 && logInStatus != true) {
				System.out.println("로그인을 해주세요");
				nowLoading = 0;
			} else if (nowLoading == 4) {
				System.out.println("종료합니다");
				break;
			}
		}
	}
}
