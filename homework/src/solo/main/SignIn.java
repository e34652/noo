package solo.main;

import solo.LoginState;
import solo.Session;

public class SignIn {

public void login(Session session) {

		
		System.out.println("ID를 입력해주세요");
		session.getLoginInput().setLoginInputId(session.getScan().nextLine());

		System.out.println("PW를 입력해주세요");
		session.getLoginInput().setLoginInputPw(session.getScan().nextLine());

		if (session.getAccount().getAccountId().equals(session.getLoginInput().getLoginInputId())) {
			if (session.getAccount().getAccountPw().equals(session.getLoginInput().getLoginInputPw())) {
				System.out.println("로그인 성공");
				session.setLoginState(LoginState.ONLINE);
			} else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		} else {
			System.out.println("일치하는 ID가 없습니다");
		}
	}

}
