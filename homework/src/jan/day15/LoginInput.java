package jan.day15;

public class LoginInput { //로그인시 입력된 ID PW
	String inputId;
	String inputPw;

	public LoginInput(String inputId, String intputPw) {
		
		this.inputId = inputId;
		this.inputId = inputPw;
	}

	public String getInputId() {
		return inputId;
	}

	public void setInputId(String inputId) {
		this.inputId = inputId;
	}

	public String getInputPw() {
		return inputPw;
	}

	public void setInputPw(String inputPw) {
		this.inputPw = inputPw;
	}
	
	
}