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
		return "Solo [id=" + id + ", pw=" + pw + ", balance=" + balance + "]";
	}
	
}
