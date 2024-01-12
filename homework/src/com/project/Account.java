package com.project;

public class Account {
	String id;
	String pw;
	Long balance;

	public Account() {
		this(null, null, null);
	}
	
	public Account(String id, String pw) {
		this(id, pw, null);		
	}
	
	public Account(String id, String pw, Long balance) {
		this.id = id;
		this.pw = pw;
		this.balance = balance;
	}
}
