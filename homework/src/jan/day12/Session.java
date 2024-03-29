package jan.day12;

public class Session {
	private boolean run;
	private boolean run2;
	private LoginInput loginInput;
	private	LoginState loginState = LoginState.OFFLINE; // 열거타입(클래스) + 변수 
	private MenuState menuState = MenuState.TOP; // String a; 와 비슷한 개념의 선언 
	private Account account; 
	// 필드 선언은 해당타입의 데이터를 저장하고 해당 클래스의 인스턴스를 참조할 수 있는 능력을 부여한다	 
	// Account account = account 라는 필드에 Account 타입의 데이터를 저장할 수 있다
	// Account 타입의 인스턴스를 참조하며 해당 인스턴스 내부의 메소드도 호출할 수 있다 
	
	public Session(boolean run, boolean run2, LoginInput loginInput, Account account) {

		this.run = run;
		this.run2 = run2;
		this.loginInput = loginInput;
		this.account = account;
	}

	
	public String getLoginInputId() {
		return loginInput.getInputId();
	}

	public void setLoginInputId(String inputId) {
		this.loginInput.setInputId(inputId);
	}
	
	public String getLoginInputPw() {
		return loginInput.getInputPw();
	}

	public void setLoginInputPw(String inputPw) {
		this.loginInput.setInputPw(inputPw);
	}
	
	public String getAccountId() {
		return account.getAccountId();
	}

	public void setAccountId(String accountId) {
		this.account.setAccountId(accountId);
	}


	public String getAccountPw() {
		return account.getAccountPw();
	}

	public void setAccountPw(String accountPw) {
		this.account.setAccountPw(accountPw);
	}

	
	public long getAccountBalance() {
		return account.getBalance();
	}

	public void setAccountBalance(long balance) {
		this.account.setBalance(balance);
	}


	public LoginState getLoginState() {
		return loginState;
	}

	public void setLoginState(LoginState loginState) {
		this.loginState = loginState;
	}

	public MenuState getMenuState() {
		return menuState;
	}

	public void setMenuState(MenuState menuState) {//
		if (menuState == MenuState.BANKING) {
			run2 = true;
		} else if (menuState == MenuState.SYSTEM_OFF) {
			run = false;
		} else if (menuState == MenuState.BANKING_EXIT) {
			run2 = false;
		}
		this.menuState = menuState;
		}
	
	
	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public boolean isRun2() {
		return run2;
	}

	public void setRun2(boolean run2) {
		this.run2 = run2;
	}

}
