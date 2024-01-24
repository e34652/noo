package jan.day23.g;

public class Button {
	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	static interface OnClickListener { // 안쪽이나 바깥쪽이나 똑같음 << 소속을 명확히, 외부노출 시에도 꼬리표가 붙음 
		void onClick();
	}
}
