package jan.day19;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	ArrayList<Account> accList = new ArrayList();
	int idx = 0;

	JButton jb1 = new JButton("전체내용");
	JButton jb2 = new JButton("입력");
	JButton jb3 = new JButton("조회");
	JButton jb4 = new JButton("수정");
	JButton jb5 = new JButton("삭제");
	JButton jb6 = new JButton("종료");

	JLabel lb1 = new JLabel("이름");
	JLabel lb2 = new JLabel("아이디");
	JLabel lb3 = new JLabel("패스워드");
	JLabel lb4 = new JLabel("생년월일");
	JLabel lb5 = new JLabel("전화");
	JLabel lb6 = new JLabel("잔고");

	JTextField jt1 = new JTextField();
	JTextField jt2 = new JTextField();
	JTextField jt3 = new JTextField();
	JTextField jt4 = new JTextField();
	JTextField jt5 = new JTextField();
	JTextField jt6 = new JTextField();

	JLabel jls1 = new JLabel("메세지를 보여 줍니다"); // 화면에 붙는 요소 = 컴포넌트
	JTextArea jta1 = new JTextArea(10, 50);

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

	public MyFrame() throws ClassNotFoundException, IOException {
		load(); // main이 아닌 다른 메소드는 객체 안에 있어야 실행될 수 있음 
		Container con = this.getContentPane();
		con.setLayout(null);

		con.add(lb1);
		lb1.setLocation(20, 50);
		lb1.setSize(100, 30);

		con.add(jt1);
		jt1.setLocation(50, 50);
		jt1.setSize(100, 30);

		con.add(lb2);
		lb2.setLocation(200, 50);
		lb2.setSize(100, 30);

		con.add(jt2);
		jt2.setLocation(250, 50);
		jt2.setSize(100, 30);

		con.add(lb3);
		lb3.setLocation(400, 50);
		lb3.setSize(100, 30);

		con.add(jt3);
		jt3.setLocation(460, 50);
		jt3.setSize(100, 30);

		con.add(lb4);
		lb4.setLocation(620, 50);
		lb4.setSize(100, 30);

		con.add(jt4);
		jt4.setLocation(680, 50);
		jt4.setSize(100, 30);

		con.add(lb5);
		lb5.setLocation(20, 80);
		lb5.setSize(100, 30);

		con.add(jt5);
		jt5.setLocation(50, 80);
		jt5.setSize(100, 30);

		con.add(lb6);
		lb6.setLocation(200, 80);
		lb6.setSize(100, 30);

		con.add(jt6);
		jt6.setLocation(250, 80);
		jt6.setSize(100, 30);
//jb
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

		con.add(jls1);
		jls1.setLocation(20, 420);
		jls1.setSize(600, 30);

		JScrollPane scroll = new JScrollPane(jta1);
		scroll.setLocation(20, 120);
		scroll.setSize(830, 200);
		con.add(scroll);

		this.setLocation(200, 100);
		this.setTitle("스윙 연습");
		this.setVisible(true); // 윈도우 프레임을 보이게
		this.setSize(900, 500); // 크기 설정
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}

	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/temp/swing.db"); // 저장 경로
		ObjectOutputStream oos = new ObjectOutputStream(fos); //
		oos.writeObject(accList);
		oos.flush();
		oos.close();
	}

	public void load() throws IOException, ClassNotFoundException {

		String folderPath = "C:\\temp";
		String fileName = "swing.db";

		Path folder = Paths.get(folderPath);
		Path filePath = folder.resolve(fileName);

		if (Files.exists(filePath)) {

			FileInputStream fis = new FileInputStream("C:/temp/swing.db"); // 저장 경로
			ObjectInputStream ois = new ObjectInputStream(fis); //
			this.accList = (ArrayList) ois.readObject();
		}
	}

	public void confirmExit() throws IOException {
		int answer = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?", "confirm", JOptionPane.YES_NO_OPTION);

		if (answer == JOptionPane.YES_OPTION) { // yes를 눌렀을 경우
			System.out.println("프로그램을 종료합니다");
			save();
			// 파일로 객체를 내보내는 일처리
			System.exit(0);
		} else { // yes 외의 값
			System.out.println("종료하지 않습니다");
			jls1.setText("시스템을 종료하지 않습니다");
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
	
		new MyFrame();

	}

	@Override

	public void actionPerformed(ActionEvent e) {

		String name = "";
		String id = "";
		String pass = "";
		String bDate = "";
		String tel = "";
		String balance = "";

		switch (e.getActionCommand()) {

		case "전체내용":
			jta1.setText("");
			jls1.setText("회원 리스트 출력");
			for (Account accToken : accList) {
				jta1.append(accToken.toString());
				jta1.append("\n");
			}
			break;

		case "입력":
			System.out.println("입력하신 정보를 바탕으로 회원가입을 시작합니다");
			System.out.printf("이름: %s | ID: %s | PW: %s | 생년월일: %s | 전화번호: %s | 계좌잔고: %s\n", jt1.getText(),
					jt2.getText(), jt3.getText(), jt4.getText(), jt5.getText(), jt6.getText());

			name = jt1.getText();
			id = jt2.getText();
			pass = jt3.getText();
			bDate = jt4.getText();
			tel = jt5.getText();
			balance = jt6.getText();

			Account acc1 = new Account(name, id, pass, bDate, tel, Integer.valueOf(balance));
			accList.add(acc1);
			jls1.setText(acc1.toString());

			break;

		case "조회":
			System.out.println("입력하신 회원님의 정보를 출력합니다");
			for (int i = 0; i < accList.size(); i++) {
				if (accList.get(i).getName().equals(jt1.getText())) {
					System.out.println(accList.get(i).getName() + "회원님의 정보를 불러옵니다");

					jt2.setText(accList.get(i).getId());
					jt3.setText(accList.get(i).getPass());
					jt4.setText(accList.get(i).getbDate());
					jt5.setText(accList.get(i).getTel());
					jt6.setText(String.valueOf(accList.get(i).getBalance()));

					idx = i;
				}
			}
			break;

		case "수정":
			System.out.println(accList.get(idx).getName() + "회원님의 정보를 수정합니다");

			name = jt1.getText();
			id = jt2.getText();
			pass = jt3.getText();
			bDate = jt4.getText();
			tel = jt5.getText();
			balance = jt6.getText();

			Account acc = new Account(name, id, pass, bDate, tel, Integer.valueOf(balance));
			accList.set(idx, acc);
			System.out.println("회원님의 정보가 수정되었습니다");
			break;
		case "삭제":
			System.out.println("조회중인 회원님의 정보를 삭제합니다");
			System.out.println(accList.get(idx).getName() + "회원님의 정보를 삭제합니다");
			accList.remove(idx);
			break;

		case "종료":
			try {
				confirmExit();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			break;
		default:
			break;
		}

	}

}