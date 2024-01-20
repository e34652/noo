package jan.day18;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	ArrayList<Account> accList = new ArrayList();
	Account acc = null;
	Account acc2 = null;
	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("입력");
	JButton jb3 = new JButton("조회");
	JButton jb4 = new JButton("수정");
	JButton jb5 = new JButton("삭제");
	JButton jb6 = new JButton("종료");

	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jt5 = new JTextField();
	JTextField jt6 = new JTextField();

	public JTextField getJt1() {
		return jt1;
	}

	public JTextField getJt2() {
		return jt2;
	}

	public JTextField getJt3() {
		return jt3;
	}

	public JTextField getJt4() {
		return jt4;
	}

	public JTextField getJt5() {
		return jt5;
	}

	public JTextField getJt6() {
		return jt6;
	}

	public MyFrame() {
		Container con = this.getContentPane();
		con.setLayout(null);

		JLabel lb1 = new JLabel("이름");
		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);

		con.add(jt1);
		jt1.setLocation(50, 50);
		jt1.setSize(100, 30);

		JLabel lb2 = new JLabel("아이디");
		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);

		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);

		JLabel lb3 = new JLabel("패스워드");
		con.add(lb3);
		lb3.setLocation(400, 50);
		lb3.setSize(100, 30);

		con.add(jt3);
		jt3.setLocation(460, 50);
		jt3.setSize(100, 30);

		JLabel lb4 = new JLabel("생년월일");
		con.add(lb4);
		lb4.setLocation(620, 50);
		lb4.setSize(100, 30);

		con.add(jt4);
		jt4.setLocation(680, 50);
		jt4.setSize(100, 30);

		JLabel lb5 = new JLabel("전화");
		con.add(lb5);
		lb5.setLocation(20, 80);
		lb5.setSize(100, 30);

		con.add(jt5);
		jt5.setLocation(50, 80);
		jt5.setSize(100, 30);

		JLabel lb6 = new JLabel("잔고");
		con.add(lb6);
		lb6.setLocation(200, 80);
		lb6.setSize(100, 30);

		con.add(jt6);
		jt6.setLocation(250, 80);
		jt6.setSize(100, 30);

		jb1.addActionListener(this);
		jb1.setLocation(20, 350);
		jb1.setSize(100, 30);
		con.add(jb1);

		jb2.addActionListener(this);
		jb2.setLocation(200, 350);
		jb2.setSize(100, 30);
		con.add(jb2);

		jb3.addActionListener(this);
		jb3.setLocation(380, 350);
		jb3.setSize(100, 30);
		con.add(jb3);

		jb4.addActionListener(this);
		jb4.setLocation(560, 350);
		jb4.setSize(100, 30);
		con.add(jb4);

		jb5.addActionListener(this);
		jb5.setLocation(740, 350);
		jb5.setSize(100, 30);
		con.add(jb5);

		jb6.addActionListener(this);
		jb6.setLocation(20, 400);
		jb6.setSize(100, 30);
		con.add(jb6);

		JTextArea ta = new JTextArea();
		ta.setLocation(20, 120);
		ta.setSize(830, 200);
		con.add(ta);

		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true); // 윈도우 프레임을 보이게
		this.setSize(900, 500); // 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

	@Override

	public void actionPerformed(ActionEvent e) {

		int idx = 0;
		switch (e.getActionCommand()) {

		case "전체내용":

			System.out.println("전체 회원 리스트를 출력합니다");
			for (Account abc : accList) {
				System.out.println(abc);
			}
			break;
		case "입력":
			System.out.println("입력하신 정보를 바탕으로 회원가입을 시작합니다");
			System.out.printf("%s, %s, %s, %s, %s, %s", jt1.getText(), jt2.getText(), jt3.getText(), jt4.getText(),
					jt5.getText(), Integer.parseInt(jt6.getText()));
			acc = new Account(jt1.getText(), jt2.getText(), jt3.getText(), jt4.getText(), jt5.getText(),
					Integer.parseInt(jt6.getText()));
			accList.add(acc);
			break;

		case "조회":
			System.out.println("입력하신 회원님의 정보를 출력합니다");
			for (int i = 0; i < accList.size(); i++) {
				if (accList.get(i).getName().equals(jt1.getText())) {
					
					System.out.println(i + "번 index");
					System.out.println(accList.get(i));
				}
			}
			break;

		case "수정":
			System.out.println("입력하신 정보로 회원님의 정보를 수정합니다");
			for (int i = 0; i < accList.size(); i++) {
				if (accList.get(i).getName().equals(jt1.getText())) {
					System.out.println("입력하신 " + (i + 1) + "번째 회원님의 정보를 수정합니다");
					System.out.println("수정할 정보를 입력하신 후 \"확인\" 버튼을 눌러주세요");
					idx = i;
				}
			}
		case "종료":
			
			

			break;

		case "삭제":
			System.out.println("입력하신 회원님의 정보를 삭제합니다");
			for (int i = 0; i < accList.size(); i++) {
				if (accList.get(i).getName().equals(jt1.getText())) {
					System.out.println(i + "번 index");
					accList.remove(i);
				}
			}
			break;
		default:
			break;
		}

	}
}


