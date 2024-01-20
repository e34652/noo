package solo;

import java.util.Scanner;

import solo.main.Banking;
import solo.main.SignIn;
import solo.main.SignUp;

public class Project1 {

	public static void disp1() { // 스태틱 메서드
		System.out.println("---------------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.로그아웃 | 5.종료");
		System.out.println("---------------------------------------------");
		System.out.print("선택> ");
	}

	public static void disp2() {
		
	}

	public static void menu1(Session session){

		while (session.isRun()) {
			disp1();// 스태틱 메서드이므로 직접적인 호출이 가능함

			int menuNum = Integer.parseInt(session.getScan().nextLine());
			switch (menuNum) {
			case 1:
				// 로그인 처리
				if (session.getLoginState() == LoginState.ONLINE) {
					System.out.println("이미 로그인 중입니다");
					break;
				}
				System.out.println("로그인 처리");
				
				session.getSignIn().login(session);;
				
				break;
			case 2:
				// 회원 가입
				if (session.getLoginState() == LoginState.ONLINE) {
					System.out.println("로그아웃 후 시도해주세요");
					break;
				}
				System.out.println("회원 가입");
				session.getSignUp().signUp(session);;
				break;
			case 3:
				// 예금 출금
				if (session.getLoginState() == LoginState.ONLINE) {
					session.setMenuState(MenuState.BANKING);
					System.out.println("은행업무");
					session.getBanking().menu2(session);
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

	

	public static void main(String[] args) {
		LoginInput loginInput = new LoginInput();
		Account account = new Account();
		SignUp signUp = new SignUp(); 
		SignIn signIn = new SignIn();
		Banking banking = new Banking();
		Scanner scan = new Scanner(System.in);
		Session session = new Session(true, false, loginInput, account, signUp, signIn, banking, scan );

		menu1(session); 

	}
}
