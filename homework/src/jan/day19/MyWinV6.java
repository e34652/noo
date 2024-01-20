package jan.day19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyWinV6 extends JFrame {
	JLabel jL1 = new JLabel("이름1"); // 화면에 붙는 요소 = 컴포넌트
	JLabel jL2 = new JLabel("이름2");

	JLabel jLS1 = new JLabel("메세지를 보여 줍니다"); // 화면에 붙는 요소 = 컴포넌트
	JLabel jLS2 = new JLabel("메세지 출력 창");

	
	JButton jB1 = new JButton("버튼1");
	JButton jB2 = new JButton("종료");

	JTextField jF1 = new JTextField(5); // << 숫자로 넓이 설정
	JTextField jF2 = new JTextField(5);
	
	JTextArea jTA1 = new JTextArea(10, 50);
	JScrollPane scroll = new JScrollPane(jTA1);	 // 스크롤이 나올 컴포넌트를 선택
	
	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?", "confirm", JOptionPane.YES_NO_OPTION);

		if (answer == JOptionPane.YES_OPTION) { // yes를 눌렀을 경우
			System.out.println("프로그램을 종료합니다");
			//파일로 객체를 내보내는 일처리
			System.exit(0);
		} else { // yes 외의 값
			System.out.println("종료하지 않습니다");
			jLS2.setText("시스템을 종료하지 않습니다");
		}
	}
	
	public MyWinV6() {
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout()); // 화면 크기가 너무 좁아져도 컴포넌트가 재배열됨
		con.add(jLS1);
		con.add(jLS2);
		con.add(jL1);
		con.add(jB1);
		con.add(jF1);
		con.add(jL2);
		con.add(jB2);
		con.add(jF2);
		con.add(scroll);
	
	
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setSize(600, 900);
		this.setLocation(200, 200);
		this.setTitle("윈도우 만들어보기");
		this.setVisible(true);
		jB1.addActionListener(new ActionListener() {// 익명 구현 객체 생성

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				jLS1.setText("버튼1을 클릭했습니다");
			}
		});

		jB2.addActionListener(new ActionListener() { // 즉시성, 일회성, 익명성

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit(); // 익명객체 속이므로 this를 호출하면 익명객체 자신의 객체가 옴
			}

		});

		// 파일 읽기 작업 처리
		JOptionPane.showMessageDialog(this, "파일을 읽었습니다", "파일읽기", JOptionPane.INFORMATION_MESSAGE);//모달창 = 창에서 선택 전에는 아무것도 못함
	}

	public static void main(String[] args) {
		new MyWinV6();

	}

}
