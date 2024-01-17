package jan.day17.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyFrame extends JFrame { // JFrame으로부터 상속받는 class
	public MyFrame() {
		Container con = this.getContentPane(); // ContentPane이란 화면에 출력될 모든 컴포넌트들이 부착되는 공간   
		//Container = 컴포넌트를 보관할 수 있음
		con.setLayout(null);
	
		JLabel jl1 = new JLabel("이름");
			con.add(jl1);
			jl1.setLocation(40, 30);
			jl1.setSize(50, 30);
		
		JTextField jt1 = new JTextField();
			con.add(jt1);
			jt1.setLocation(90, 30);
			jt1.setSize(100, 30);
			
			JLabel jl2 = new JLabel("아이디");
			con.add(jl2);
			jl2.setLocation(240, 30);
			jl2.setSize(50, 30);
		
			JTextField jt2 = new JTextField();
			con.add(jt2);
			jt2.setLocation(290, 30);
			jt2.setSize(100, 30);
			
			JLabel jl3 = new JLabel("패스워드");
			con.add(jl3);
			jl3.setLocation(440, 30);
			jl3.setSize(50, 30);
		
		JTextField jt3 = new JTextField();
			con.add(jt3);
			jt3.setLocation(500, 30);
			jt3.setSize(100, 30);
			
			JLabel jl4 = new JLabel("생년월일");
			con.add(jl4);
			jl4.setLocation(640, 30);
			jl4.setSize(50, 30);
		
		JTextField jt4 = new JTextField();
			con.add(jt4);
			jt4.setLocation(700, 30);
			jt4.setSize(100, 30);
			
			JLabel jl5 = new JLabel("전화번호");
			con.add(jl5);
			jl5.setLocation(840, 30);
			jl5.setSize(50, 30);
		
		JTextField jt5 = new JTextField();
			con.add(jt5);
			jt5.setLocation(900, 30);
			jt5.setSize(100, 30);
			
			JLabel jl6 = new JLabel("잔고");
			con.add(jl6);
			jl6.setLocation(1040, 30);
			jl6.setSize(50, 30);
		
		JTextField jt6 = new JTextField();
			con.add(jt6);
			jt6.setLocation(1090, 30);
			jt6.setSize(100, 30);
		
			JButton jb1 = new JButton("전체내용");
			con.add(jb1);
			jb1.setLocation(50, 400);
			jb1.setSize(120, 40);
			
			JButton jb2 = new JButton("입력");
			con.add(jb2);
			jb2.setLocation(310, 400);
			jb2.setSize(120, 40);
		
			
			JButton jb3 = new JButton("조회");
			con.add(jb3);
			jb3.setLocation(570, 400);
			jb3.setSize(120, 40);
		
			
			JButton jb4 = new JButton("수정");
			con.add(jb4);
			jb4.setLocation(830, 400);
			jb4.setSize(120, 40);
			
			JButton jb5= new JButton("삭제");
			con.add(jb5);
			jb5.setLocation(1090, 400);
			jb5.setSize(120, 40);
		

			//set에는 순서가 없음 <<
			this.setTitle("스윙연습");
			this.setLocation(300, 300); // 윈도우 생성 위치 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 
			this.setSize(1300, 600); // 윈도우 크기
			this.setVisible(true); // 윈도우 프레임을 보이게하는 기능
	}
	
	public static void main(String... args) {
		new MyFrame();// 객체 생성 후 실행
	}

}
