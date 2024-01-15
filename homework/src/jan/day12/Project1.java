package jan.day12;

import java.util.Scanner;

public class Project1 {

	static Scanner scanner = new Scanner(System.in); // 스태틱 필드,실행이 끝날 때까지 메모리 할당
	
	public static void disp1() { // 스태틱 메서드
		System.out.println("---------------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.로그아웃 | 5.종료");
		System.out.println("---------------------------------------------");
		System.out.print("선택> ");
	}

	public static void disp2() {
		System.out.println("-------------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.초기화면");
		System.out.println("-------------------------------------");
		System.out.print("선택> ");
	}

	public static void menu1(Session session) {

		while (session.isRun()) {
			disp1();// 스태틱 메서드이므로 직접적인 호출이 가능함

			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				if (session.getLoginState() == LoginState.ONLINE) {
					System.out.println("이미 로그인 중입니다");
					break;
				}
				System.out.println("로그인 처리");
				login(session);
				break;
			case 2:
				// 회원 가입
				if (session.getLoginState() == LoginState.ONLINE) {
					System.out.println("로그아웃 후 시도해주세요");
					break;
				}
				System.out.println("회원 가입");
				signOn(session);
				break;
			case 3:
				// 예금 출금
				if (session.getLoginState() == LoginState.ONLINE) {
					session.setMenuState(MenuState.BANKING);
					System.out.println("은행업무");
					menu2(session);
					break;
				}

				System.out.println("로그인이 필요합니다");
				break;
			case 4:
				session.setLoginState(LoginState.OFFLINE);
				System.out.println("로그아웃 되었습니다");
				break;
			case 5:
				session.setMenuState(MenuState.SYSTEM_OFF);
				System.out.println("프로그램 종료");
				break;

			default:
				System.out.println("1~5 사이의 숫자를 입력해주세요");
			}
		}
	}

	public static void signOn(Session session) {

		System.out.println("회원가입을 시작합니다");

		System.out.println("사용하실 ID를 입력해주세요");
		session.setAccountId(scanner.nextLine());

		System.out.println("사용하실 PW를 입력해주세요");
		session.setAccountPw(scanner.nextLine());

		System.out.println("회원가입이 완료되었습니다");
		System.out.printf("ID : %s\nPW : %s\n", session.getAccountId(), session.getAccountPw());

	}

	public static void login(Session session) {

		System.out.println("ID를 입력해주세요");
		session.setLoginInputId(scanner.nextLine());

		System.out.println("PW를 입력해주세요");
		session.setLoginInputPw(scanner.nextLine());

		if (session.getAccountId().equals(session.getLoginInputId())) {
			if (session.getAccountPw().equals(session.getLoginInputPw())) {
				System.out.println("로그인 성공");
				session.setLoginState(LoginState.ONLINE);
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		} else {
			System.out.println("일치하는 ID가 없습니다");
		}
	}

	public static void menu2(Session session) {

		while (session.isRun2()) {
			disp2();// 스태틱 메서드이므로 직접적인 호출이 가능함

			int menuNum2 = Integer.parseInt(scanner.nextLine());
			switch (menuNum2) {
			case 1:
				System.out.println("현재 잔고: " + session.getAccountBalance());
				System.out.println("얼마를 예금하시겠습니까?\n 금액: ");

				session.setAccountBalance(session.getAccountBalance() + Long.parseLong(scanner.nextLine()));

				System.out.println("예금 후 잔액: " + session.getAccountBalance());
				break;
			case 2:
				System.out.println("현재 잔고: " + session.getAccountBalance());
				System.out.println("얼마를 출금하시겠습니까? \n 금액: ");

				session.setAccountBalance(session.getAccountBalance() - Long.parseLong(scanner.nextLine()));

				System.out.println("출금 후 잔액: " + session.getAccountBalance());
				break;
			case 3:
				System.out.println("현재 잔고: " + session.getAccountBalance());
				break;
			case 4:
				// 초기 화면
				session.setMenuState(MenuState.BANKING_EXIT);
				System.out.println("초기화면으로 돌아갑니다");
				break;
			}
		}
	}

	public static void main(String[] args) {
		LoginInput loginInput = new LoginInput("id", "pw");
		Account account = new Account("id", "pw");
//세션 클래스에 필드로 사용되는 클래스 타입의 인스턴스를 먼저 생성하고 이를 매개값으로 하여 세션 인스턴스 초기화
		Session session = new Session(true, false, loginInput, account);
//이렇게 한 클래스에 다른 클래스 정보를 연동시켜놓으면 추후 다른 메소드에 매개값을 넣을때 편하고 직관적이게 됨 
		menu1(session); // << 세션에 모든 정보가 다 있으므로 세션만 매개값으로 주고 호출

	}
}
