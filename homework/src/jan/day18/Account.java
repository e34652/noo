package jan.day18;

import java.io.Serializable;

public class Account implements Serializable {
	private String name;
	private String id;
	private String pass;
	private String bDate;
	private String tel;
	private int balance;

	public Account() {

	}

	public Account(String name, String id, String pass, String bDate, String tel, int balance) {
		this.name = name;
		this.id = id;
		this.pass = pass;
		this.bDate = bDate;
		this.tel = tel;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getbDate() {
		return bDate;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int deposit) {
		// 입금
		if (deposit <= 0) {
			System.out.println("금액을 정확히 입력하세요.");
			return;
		}
		balance += deposit;
	}

	// 출금
	public void withdraw(int withdraw) {
		if (withdraw > balance) {
			System.out.println("잔액이 부족합니다.");
			return;
		}

		if (withdraw <= 0) {
			System.out.println("0원 및 마이너스단위는 출금하실 수 없습니다.");
			return;
		}
		balance -= withdraw;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", id=" + id + ", pass=" + pass + ", bDate=" + bDate + ", tel=" + tel
				+ ", balance=" + balance + "]";
	}

}