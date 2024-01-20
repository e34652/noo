package solo;

import java.io.Serializable;

public class Account implements Serializable{ // 회원 정보 
	private String accountId;
	private String accountPw;
	private Long accountBalance;
	
	public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public String getAccountPw() {
		return accountPw;
	}


	public void setAccountPw(String accountPw) {
		this.accountPw = accountPw;
	}


	public Long getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}


	public Account() {
	}
	
	public Account(String accountId, String accountPw) {
		this(accountId, accountPw, 0L);
	}
	
	public Account(String accountId, String accountPw, Long accountBalance) {
		this.accountId = accountId;
		this.accountPw = accountPw;
		this.accountBalance = accountBalance;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountPw=" + accountPw + ", balance=" + accountBalance + "]";
	}


	
}
