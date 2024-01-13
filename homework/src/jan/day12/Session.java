package jan.day12;

public class Session {
	private boolean run;
	private boolean run2;
	private LoginInput loginInput;
	private	LoginState loginState = LoginState.OFFLINE;
	private MenuState menuState = MenuState.TOP;
	private Account account;
	
	
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

	public void setMenuState(MenuState menuState) {
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
