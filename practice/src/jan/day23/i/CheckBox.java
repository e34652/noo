package jan.day23.i;

public class CheckBox {
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener{
		void onSelect();
		}
	}
