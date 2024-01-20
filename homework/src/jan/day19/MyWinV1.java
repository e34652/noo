package jan.day19;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyWinV1 extends JFrame {
	public MyWinV1() {
	Container con = this.getContentPane();
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(600, 900);
	this.setLocation(200, 200);
	this.setTitle("윈도우 만들어보기");
	this.setVisible(true);
	}
	public static void main (String[] args) {
		new MyWinV1();

	}

}
