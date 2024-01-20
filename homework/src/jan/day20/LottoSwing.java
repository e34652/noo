package jan.day20;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LottoSwing extends JFrame implements ActionListener {
	LottoFunc lFunc = new LottoFunc();
	int times = 0;

	JTextField jtf1 = new JTextField();
	JButton jb1 = new JButton("번호 생성");
	JButton jb2 = new JButton("화면 청소");
	JLabel jl1 = new JLabel("번호 개수 입력");
	JLabel jl2 = new JLabel("개");
	JLabel jls1 = new JLabel("랜덤 숫자 생성기 V1");
	JTextArea jta1 = new JTextArea(50, 10);
	JScrollPane scroll = new JScrollPane(jta1);

	public JTextField getJtf1() {
		return jtf1;
	}

	public LottoSwing() {
		Container con = this.getContentPane();
		con.setLayout(null);

		con.add(jtf1);
		jtf1.setLocation(230, 50);
		jtf1.setSize(80, 30);

		con.add(jls1);
		jls1.setLocation(20, 330);
		jls1.setSize(600, 30);

		con.add(jl1);
		jl1.setLocation(20, 50);
		jl1.setSize(300, 30);

		con.add(jl2);
		jl2.setLocation(320, 50);
		jl2.setSize(300, 30);

		con.add(jb1);
		jb1.addActionListener(this);
		jb1.setLocation(400, 50);
		jb1.setSize(130, 30);
		
		con.add(jb2);
		jb2.addActionListener(this);
		jb2.setLocation(600, 50);
		jb2.setSize(130, 30);

		con.add(scroll);
		scroll.setLocation(20, 120);
		scroll.setSize(830, 200);

		this.setSize(880, 420);
		this.setLocation(200, 200);
		this.setTitle("로또 번호 생성기");
		// this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {

		new LottoSwing();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "번호 생성":
			if (jtf1.getText().equals("")) {
				jta1.append("원하는 숫자의 개수를 입력해주세요");
			} else if (e.getSource() == jb1) {
				jls1.setText("로또 번호를 출력합니다");
				times = Integer.valueOf(jtf1.getText());
				int[] nums = new int[times];
				lFunc.newNum(nums);
				lFunc.dupCheck(nums);
				lFunc.sortNum(nums);
				for (int i = 0; i < nums.length; i++) {
					jta1.append(String.valueOf(nums[i]) + " ");
				}
				jta1.append("\n");
				break;
			}
		case "화면 청소":
			jta1.setText("");
			jls1.setText("화면을 청소합니다");
			break;
		}

	}
}
