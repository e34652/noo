package jan.day10;

public class Solo {
	String id;
	String pw;
	Long balance;
	
	
	public Solo() {
		this(null, null, 0L);
	}
	public Solo(String id, String pw) {
		this(id, pw, 0L);
	}
	
	public Solo(String id, String pw, Long balance) {
		this.id = id;
		this.pw = pw;
		this.balance = balance;
		
	}

	@Override
	public String toString() {
		return "회원 ID: " + id + " 회원 PW: " + pw + " 계좌 잔고: " + balance;
	}
	
}
