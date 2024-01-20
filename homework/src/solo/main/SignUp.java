package solo.main;

import solo.Session;

public class SignUp {
	
	public SignUp() {
		
	}
	public SignUp(Session session) {
		
	}
	
	public void signUp(Session session) {

		System.out.println("회원가입을 시작합니다");

		System.out.println("사용하실 ID를 입력해주세요");
		session.getAccount().setAccountId(session.getScan().nextLine());

		System.out.println("사용하실 PW를 입력해주세요");
		session.getAccount().setAccountPw(session.getScan().nextLine());
		session.getAccount().setAccountBalance(0L);
		
		System.out.println("회원가입이 완료되었습니다");
		System.out.printf("ID : %s\nPW : %s\n", session.getAccount().getAccountId(), session.getAccount().getAccountPw());
	}
}
