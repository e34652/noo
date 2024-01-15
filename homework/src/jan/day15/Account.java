package jan.day15;

import java.io.Serializable;

public class Account implements Serializable{ // 회원 정보 
	private String accountId;
	private String accountPw;
	private Long balance;
	
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


	public Long getBalance() {
		return balance;
	}


	public void setBalance(Long balance) {
		this.balance = balance;
	}


	public Account() {
	}
	
	public Account(String accountId, String accountPw) {
		this(accountId, accountPw, 0L);
	}
	
	public Account(String accountId, String accountPw, Long balance) {
		this.accountId = accountId;
		this.accountPw = accountPw;
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountPw=" + accountPw + ", balance=" + balance + "]";
	}


	
}
