package solo;

import java.util.Scanner;

import solo.main.*;

public class Session {
	private boolean run;
	private boolean run2;
	private LoginState loginState = LoginState.OFFLINE;
	private MenuState menuState = MenuState.TOP;

	private LoginInput loginInput;
	private Account account;
	private SignUp signUp;
	private SignIn signIn;
	private Banking banking;
	private Scanner scan;

	public Session(boolean run, boolean run2, LoginInput loginInput,
			Account account, SignUp signUp, SignIn signIn, Banking banking, Scanner scan) {
		super();
		this.run = run;
		this.run2 = run2;
		this.loginInput = loginInput;
		this.account = account;
		this.signUp = signUp;
		this.signIn = signIn;
		this.banking = banking;
		this.scan = scan;
	}

	
	
	
	public Banking getBanking() {
		return banking;
	}


	public void setBanking(Banking banking) {
		this.banking = banking;
	}


	public SignIn getSignIn() {
		return signIn;
	}

	public void setSignIn(SignIn signIn) {
		this.signIn = signIn;
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

	
	
	
	public LoginInput getLoginInput() {
		return loginInput;
	}

	public void setLoginInput(LoginInput loginInput) {
		this.loginInput = loginInput;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public SignUp getSignUp() {
		return signUp;
	}

	public void setSignUp(SignUp signUp) {
		this.signUp = signUp;
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
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
