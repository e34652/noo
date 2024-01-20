package solo.main;

import solo.MenuState;
import solo.Session;

public class Banking {

	public void menu2(Session session) {

		while (session.isRun2()) {
			
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.초기화면");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");// 스태틱 메서드이므로 직접적인 호출이 가능함

			int menuNum2 = Integer.parseInt(session.getScan().nextLine());
			switch (menuNum2) {
			case 1:
				System.out.println("현재 잔고: " + session.getAccount().getAccountBalance());
				System.out.println("얼마를 예금하시겠습니까?\n 금액: ");

				session.getAccount().setAccountBalance(session.getAccount().getAccountBalance() + Long.parseLong(session.getScan().nextLine()));

				System.out.println("예금 후 잔액: " + session.getAccount().getAccountBalance());
				break;
			case 2:
				System.out.println("현재 잔고: " + session.getAccount().getAccountBalance());
				System.out.println("얼마를 출금하시겠습니까? \n 금액: ");

				session.getAccount().setAccountBalance(session.getAccount().getAccountBalance() - Long.parseLong(session.getScan().nextLine()));

				System.out.println("출금 후 잔액: " + session.getAccount().getAccountBalance());
				break;
			case 3:
				System.out.println("현재 잔고: " + session.getAccount().getAccountBalance());
				break;
			case 4:
				// 초기 화면
				session.setMenuState(MenuState.BANKING_EXIT);
				System.out.println("초기화면으로 돌아갑니다");
				break;
			}
		}
	}
	
}
