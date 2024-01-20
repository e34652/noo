package jan.day19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWinV31 extends JFrame implements ActionListener { // 액션리스너는 버튼에 대한 이벤트
	JLabel jL1 = new JLabel("이름1"); // 화면에 붙는 요소 = 컴포넌트
	JLabel jL2 = new JLabel("이름2");

	JButton jB1 = new JButton("버튼1");
	JButton jB2 = new JButton("버튼2");

	JTextField jF1 = new JTextField(5); // << 숫자로 넓이 설정
	JTextField jF2 = new JTextField(5);

	public MyWinV31() {
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout()); // 화면 크기가 너무 좁아져도 컴포넌트가 재배열됨
		con.add(jL1);
		con.add(jB1);
		con.add(jF1);
		con.add(jL2);
		con.add(jB2);
		con.add(jF2);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 900);
		this.setLocation(200, 200);
		this.setTitle("윈도우 만들어보기");
		this.setVisible(true);

		jB1.addActionListener(this);


		jB2.addActionListener(this);


		jF1.addActionListener(this);


		jF2.addActionListener(this);
	}

	public static void main(String[] args) {
		new MyWinV31();

	}

	@Override
	public void actionPerformed(ActionEvent e) { // 액션리스너에 등록된 컴포넌트와 상호작용을 했을 때 실행됨
		if (e.getSource().equals(jB1)) { // equals(jB1) 대신 == jB1 가능
			System.out.println("클릭!");
		} else if (e.getSource().equals(jB2)) {
			System.out.println("클릭!");
		}
	}
}
