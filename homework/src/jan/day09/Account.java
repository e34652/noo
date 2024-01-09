package jan.day09;

public class Account {
	String id;
	String pw;
	long balance;

	public Account(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public Account(String id, String pw, long balance) {
		this.id = id;
		this.pw = pw;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "가입 완료\nID = " + id + "\nPW=" + pw;
	}

}
