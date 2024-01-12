package com.project;

import java.util.Scanner;

public class Project1 {

	static Scanner scanner = new Scanner(System.in); // 스태틱 필드,실행이 끝날 때까지 메모리 할당

	public static void disp1() { // 스태틱 메서드
		System.out.println("-------------------------------------");
		System.out.println("1.로그인 | 2.회원가입 | 3.예금/출금 | 4.종료");
		System.out.println("-------------------------------------");
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
				System.out.println("로그인 처리");
				break;
			case 2:
				// 회원 가입
				System.out.println("회원 가입");
				break;
			case 3:
				// 예금 출금
				if (session.getLoginInfo() != null) {
					session.setMenuState(MenuState.BANKING);
					System.out.println("은행업무");
					menu2(session);
				}
				break;
			case 4:
				session.setMenuState(MenuState.SYSTEM_OFF);
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

	public static void menu2(Session session) {

		while (session.isRun2()) {
			disp2();// 스태틱 메서드이므로 직접적인 호출이 가능함

			int menuNum2 = Integer.parseInt(scanner.nextLine());
			switch (menuNum2) {
			case 1:
				// 로그인 처리
				System.out.println("예금");
				break;
			case 2:
				// 회원 가입
				System.out.println("출금");
				break;
			case 3:
				// 예금 출금
				System.out.println("잔액");
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
		LoginInfo loginInfo = new LoginInfo("id", "pw");
		Session session = new Session(loginInfo, true, false);
		menu1(session);

	}
}
