package jan.day24.f;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) { // 버튼을 touch()하면 매개변수의 onClick메소드를 사용하겠다  
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick(); 
	}
	
	static interface OnClickListener{ // 인터페이스
		void onClick();
	}
	
}
