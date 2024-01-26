package monthlytest.CRUD;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame {

	JTextField tf1 = new JTextField(6);
	JTextField tf2 = new JTextField(6);
	JTextField tf3 = new JTextField(6);
	JTextField tf4 = new JTextField(6);
	JTextField tf5 = new JTextField(6);
	JTextField tf6 = new JTextField(6);
	JTextField tf7 = new JTextField(6);
	JTextField tf8 = new JTextField(6);

	JButton bt1 = new JButton("전체 내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름 검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");

	
	JTextArea ta = new JTextArea(10, 40);
	Connection conn;
	Statement stmt;

	public GUI() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pass);
			stmt = conn.createStatement();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		JLabel lb1 = new JLabel("사원코드:");
		JLabel lb2 = new JLabel("이름:");
		JLabel lb3 = new JLabel("직무:");
		JLabel lb4 = new JLabel("사수코드:");
		JLabel lb5 = new JLabel("입사일:");
		JLabel lb6 = new JLabel("급여:");
		JLabel lb7 = new JLabel("수당:");
		JLabel lb8 = new JLabel("부서코드:");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt5);
		con.add(jp1, BorderLayout.SOUTH);
		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.add(scroll);
		con.add(jp2, BorderLayout.CENTER);

		JPanel jp3 = new JPanel(new FlowLayout());
		con.add(jp3, BorderLayout.NORTH);
		jp3.add(lb1);jp3.add(tf1);
		jp3.add(lb2);jp3.add(tf2);
		jp3.add(lb3);jp3.add(tf3);
		jp3.add(lb4);jp3.add(tf4);
		jp3.add(lb5);jp3.add(tf5);
		jp3.add(lb6);jp3.add(tf6);
		jp3.add(lb7);jp3.add(tf7);
		jp3.add(lb8);jp3.add(tf8);

		this.setTitle("Emp 관리");
		this.setLocation(500, 400);
		this.setSize(500, 300);
		this.setVisible(true);

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				select();

			}
		});
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				insert();
				clearTextField();
			}
		});
		
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				selectMember();
				
			}
			
		});
		
		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				update();
				
			}
			
		});
		
		bt5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				delete();
				
			}
			
		});

	}

	private void clearTextField() {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");
		tf8.setText("");
	}

	public void select() {

		try {
			ta.setText("");
			String sql = "select * from emp";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String empno = rs.getString("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hiredate = rs.getString("hiredate");
				String sal = rs.getString("sal");
				String comm = rs.getString("comm");
				String deptno = rs.getString("deptno");
				String str = String.format(
						"사번 : %s | 이름 : %s | 직무 : %s | 사수 : %s | 입사일 : | 급여 : %s | 수당 : %s | 부서 코드 : %s", empno, ename,
						job, mgr, hiredate, sal, comm, deptno);
				ta.append(str + "\n");

			}
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void selectMember() {
		try {
			ta.setText("");
			String sql = String.format("select * from emp where ename = '%s' and empno = %s", tf2.getText(),
					tf1.getText());
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				
				String empno = rs.getString("empno");
				tf1.setText(empno);
				String ename = rs.getString("ename");
				tf2.setText(ename);
				String job = rs.getString("job");
				tf3.setText(job);
				String mgr = rs.getString("mgr");
				tf4.setText(mgr);
				String hiredate = rs.getString("hiredate");
				tf5.setText(hiredate);
				String sal = rs.getString("sal");
				tf6.setText(sal);
				String comm = rs.getString("comm");
				tf7.setText(comm);
				String deptno = rs.getString("deptno");
				tf8.setText(deptno);
				String str = String.format(
						"사번 : %s | 이름 : %s | 직무 : %s | 사수 : %s | 입사일 : %s | 급여 : %s | 수당 : %s | 부서 코드 : %s", empno,
						ename, job, mgr, hiredate, sal, comm, deptno);
				ta.append(str);
			}
				rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insert() {
		try {
			ta.setText("");
			String empno = tf1.getText();
			String ename = tf2.getText();
			String job = tf3.getText();
			String mgr = tf4.getText();
			String hiredate = tf5.getText();
			String sal = tf6.getText();
			String comm = tf7.getText();
			String deptno = tf8.getText();
			String str = String.format(	"사번 : %s | 이름 : %s | 직무 : %s | 사수 : %s | 입사일 : %s | 급여 : %s | 수당 : %s | 부서 코드 : %s", empno,
					ename, job, mgr, hiredate, sal, comm, deptno);
			String sql = String.format("insert into emp values (%s, '%s', '%s', %s, '%s', %s, %s, %s)", empno,
					ename, job, mgr, hiredate, sal, comm, deptno);

			int result = stmt.executeUpdate(sql);
			
			if (result == 1) {
				ta.append("\n추가 성공\n>" + str);
			} else {
				ta.append("\n추가 실패");
			}

		} catch (SQLException e) {

		}

	}

	

	public void delete() {
		try {
			String sql = String.format("delete from emp where ename = '%s' and empno = %s", tf2.getText(), tf1.getText());

			int result = stmt.executeUpdate(sql); // stmt로 DB에 전송해 쿼리문 수행

			if (result == 1) {
				ta.append("\n삭제 성공");
			} else {
				ta.append("\n삭제 실패");
			}
			
		} catch (SQLException e) {

		}

	}

	public void update() {
		try {
			
			String empno = tf1.getText();
			String ename = tf2.getText();
			String job = tf3.getText();
			String mgr = tf4.getText();
			String hiredate = tf5.getText();
			String sal = tf6.getText();
			String comm = tf7.getText();
			String deptno = tf8.getText();
			
			
			String sql = String.format("update emp set ename = '%s', job = '%s', mgr = %s, sal = %s, comm = %s, deptno = %s where empno = %s;",ename ,job, mgr, sal, comm, deptno, empno); // DB에서 수행할 쿼리문 // 작성
			String str = String.format(
					"사번 : %s | 이름 : %s | 직무 : %s | 사수 : %s | 입사일 : %s | 급여 : %s | 수당 : %s | 부서 코드 : %s", empno,
					ename, job, mgr, hiredate, sal, comm, deptno);
		int result = stmt.executeUpdate(sql); // stmt로 DB에 전송해 쿼리문 수행

		if (result == 1) {
			ta.setText("");
			ta.append("\n수정 성공\n>" + str);
		} else {
			ta.append("\n수정 실패");
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		new GUI();
	}

}
