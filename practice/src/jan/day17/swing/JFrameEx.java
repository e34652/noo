package jan.day17.swing;

import javax.swing.JFrame;

public class JFrameEx { // JFrame의 인스턴스 변수 생성 

		public static void main(String[] args) {
			JFrame jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(300, 300);
			jf.setVisible(true);
		}
}
