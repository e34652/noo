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
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI3 extends JFrame {

	JTextField tf1 = new JTextField(6);// 사번
	JTextField tf2 = new JTextField(6);// 이름
	JTextField tf3 = new JTextField(6);// 직무
	JTextField tf4 = new JTextField(6);// 사수코드
	JTextField tf5 = new JTextField(6);// 입사일
	JTextField tf6 = new JTextField(6);// 급여
	JTextField tf7 = new JTextField(6);// 수당
	JTextField tf8 = new JTextField(6);// 부서코드

	JButton bt1 = new JButton("전체 내용");
	JButton bt2 = new JButton("입력");
	JButton bt3 = new JButton("이름 검색");
	JButton bt4 = new JButton("수정");
	JButton bt5 = new JButton("삭제");
	JButton bt6 = new JButton("개별 수정");
	JButton bt7 = new JButton("날짜");
	JTextArea ta = new JTextArea(10, 40);
	Connection conn;
	Statement stmt;

	public GUI3() {
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
		JLabel lb9 = new JLabel("날짜 버튼을 클릭하세요");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel(new FlowLayout());
		jp1.add(bt1);
		jp1.add(bt2);
		jp1.add(bt3);
		jp1.add(bt4);
		jp1.add(bt6);
		jp1.add(bt5);

		con.add(jp1, BorderLayout.SOUTH);
		JScrollPane scroll = new JScrollPane(ta);
		JPanel jp2 = new JPanel(new FlowLayout());
		jp2.add(scroll);
		con.add(jp2, BorderLayout.CENTER);

		JPanel jp3 = new JPanel(new FlowLayout());
		con.add(jp3, BorderLayout.NORTH);

		jp3.add(lb1);
		jp3.add(tf1);
		jp3.add(lb2);
		jp3.add(tf2);
		jp3.add(lb3);
		jp3.add(tf3);
		jp3.add(lb4);
		jp3.add(tf4);
		jp3.add(lb5);
		jp3.add(lb9);
		jp3.add(bt7);
		jp3.add(lb6);
		jp3.add(tf6);
		jp3.add(lb7);
		jp3.add(tf7);
		jp3.add(lb8);
		jp3.add(tf8);

		this.setTitle("Emp 관리");
		this.setLocation(500, 400);
		this.setSize(1000, 300);
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

		bt6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				update2();

			}

		});
		bt7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				hireDate();

			}

		});
	}

	private boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	private void nullCheck() {
		String tf;
		if (!isNumeric(tf1.getText())) {
			System.out.println("사번은 숫자로 입력해주세요");
		}
		if (isNumeric(tf2.getText())) {
			System.out.println("이름에는 숫자가 포함될 수 없습니다");
		}
		if (isNumeric(tf3.getText())) {
			System.out.println("직무에는 숫자가 포함될 수 없습니다");
		}
		if (!isNumeric(tf4.getText())) {
			System.out.println("사수 번호는 숫자로 입력해주세요");
		}
		
		if (!isNumeric(tf6.getText())) {
			System.out.println("급여는 숫자로 입력해주세요");
		}
		if (!isNumeric(tf7.getText())) {
			System.out.println("수당은 숫자로 입력해주세요");
		}
		if (!isNumeric(tf8.getText())) {
			System.out.println("부서 코드는 숫자로 입력해주세요");
		}

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
			System.out.println("네트워크 상태를 확인해 주세요");

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
			String str = String.format(
					"사번 : %s | 이름 : %s | 직무 : %s | 사수 : %s | 입사일 : %s | 급여 : %s | 수당 : %s | 부서 코드 : %s", empno, ename,
					job, mgr, hiredate, sal, comm, deptno);
			String sql = String.format("insert into emp values (%s, '%s', '%s', %s, '%s', %s, %s, %s)", empno, ename,
					job, mgr, hiredate, sal, comm, deptno);

			int result = stmt.executeUpdate(sql);

			if (result == 1) {
				ta.append("\n추가 성공\n>" + str);
			} else {
				ta.append("\n추가 실패");
			}

		} catch (SQLSyntaxErrorException e) {
			System.out.println("올바른 값을 입력해 주세요");
		} catch (SQLException e) {
			System.out.println("네트워크 상태를 확인해 주세요");
		}
	}

	public void delete() {
		try {
			String sql = String.format("delete from emp where ename = '%s' and empno = %s", tf2.getText(),
					tf1.getText());

			int result = stmt.executeUpdate(sql); // stmt로 DB에 전송해 쿼리문 수행

			if (result == 1) {
				ta.append("\n삭제 성공");
			} else {
				ta.append("\n삭제 실패");
			}

		} catch (SQLException e) {
			System.out.println("네트워크 상태를 확인해 주세요");
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

			String sql = String.format(
					"update emp set ename = '%s', job = '%s', mgr = %s, sal = %s, comm = %s, deptno = %s where empno = %s;",
					ename, job, mgr, sal, comm, deptno, empno); // DB에서 수행할 쿼리문 // 작성
			String str = String.format(
					"사번 : %s | 이름 : %s | 직무 : %s | 사수 : %s | 입사일 : %s | 급여 : %s | 수당 : %s | 부서 코드 : %s", empno, ename,
					job, mgr, hiredate, sal, comm, deptno);
			int result = stmt.executeUpdate(sql); // stmt로 DB에 전송해 쿼리문 수행

			if (result == 1) {
				ta.setText("");
				ta.append("수정 성공\n>" + str);
			} else {
				ta.append("수정 실패");
			}
		} catch (SQLSyntaxErrorException e) {
			System.out.println("올바른 값을 입력해 주세요");
		} catch (SQLException e) {
			System.out.println("네트워크 상태를 확인해 주세요");
		}

	}

	public void update2() {
		JFrame window = new JFrame();

		JTextArea ta11 = new JTextArea();
		window.getContentPane().add(ta11);
		ta11.setLocation(160, 30);
		ta11.setSize(300, 100);

		JTextField tf11 = new JTextField(10);
		window.getContentPane().add(tf11);
		tf11.setLocation(260, 160);
		tf11.setSize(120, 30);

		JTextField tf22 = new JTextField(10);
		window.getContentPane().add(tf22);
		tf22.setLocation(260, 200);
		tf22.setSize(120, 30);

		JButton bt11 = new JButton("수정");
		window.getContentPane().add(bt11);
		bt11.setLocation(200, 260);
		bt11.setSize(80, 30);

		JButton bt22 = new JButton("종료");
		window.getContentPane().add(bt22);
		bt22.setLocation(320, 260);
		bt22.setSize(80, 30);

		JLabel lb11 = new JLabel("수정할 항목");
		window.getContentPane().add(lb11);
		lb11.setLocation(180, 150);
		lb11.setSize(80, 50);

		JLabel lb22 = new JLabel("새로운 값");
		window.getContentPane().add(lb22);
		lb22.setLocation(180, 190);
		lb22.setSize(80, 50);

		window.setLayout(null);
		window.setSize(600, 400);
		window.setLocation(400, 400);
		window.setVisible(true);
		window.setDefaultCloseOperation(window.DO_NOTHING_ON_CLOSE);
		window.setTitle("개별 수정");

		bt11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String empno = tf1.getText();
					String sql = String.format("update emp set %s = '%s' where empno = %s", tf11.getText(),
							tf22.getText(), empno);
					int result1 = stmt.executeUpdate(sql);

					if (result1 == 1) {
						ta11.setText(String.format("%s = %s 변경되었습니다", tf11.getText(), tf22.getText()));
						JOptionPane.showMessageDialog(null, "수정 성공", "성공", JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "수정 실패", "에러", JOptionPane.INFORMATION_MESSAGE);
					}

				} catch (SQLSyntaxErrorException e1) {
					System.out.println("올바른 값을 입력해 주세요");
				} catch (SQLException e1) {
					System.out.println("네트워크 상태를 확인해 주세요");
				}
			}
		});
		bt22.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				window.dispose();

			}

		});
	}

	public void hireDate() {
		JFrame window2 = new JFrame();

		JTextField tfHD = new JTextField(10);

		JButton btHD1 = new JButton("입력");
		JButton btHD2 = new JButton("종료");
		JButton btHD3 = new JButton("확인");

		JLabel lbYear = new JLabel("연");
		JLabel lbMonth = new JLabel("월");
		JLabel lbDay = new JLabel("일");

		window2.getContentPane().add(tfHD);
		tfHD.setLocation(160, 130);
		tfHD.setSize(300, 30);

		//
		window2.getContentPane().add(btHD1);
		btHD1.setLocation(200, 260);
		btHD1.setSize(80, 30);

		window2.getContentPane().add(btHD2);
		btHD2.setLocation(320, 260);
		btHD2.setSize(80, 30);

		window2.getContentPane().add(btHD3);
		btHD3.setLocation(440, 30);
		btHD3.setSize(60, 20);

		//
		window2.getContentPane().add(lbYear);
		lbYear.setLocation(80, 25);
		lbYear.setSize(50, 30);

		window2.getContentPane().add(lbMonth);
		lbMonth.setLocation(200, 25);
		lbMonth.setSize(50, 30);

		window2.getContentPane().add(lbDay);
		lbDay.setLocation(320, 25);
		lbDay.setSize(50, 30);
//
		window2.setLayout(null);
		window2.setSize(600, 400);
		window2.setLocation(400, 400);
		window2.setVisible(true);
		window2.setDefaultCloseOperation(window2.DO_NOTHING_ON_CLOSE);
		window2.setTitle("입사일 선택");

		// 연도 리스트
		String[] years = new String[70];
		for (int i = 0; i < 70; i++) {
			years[i] = Integer.toString(i + 1940);
		}
		JComboBox<String> sL1 = new JComboBox<>(years);
		window2.add(sL1);
		sL1.setLocation(100, 30);
		sL1.setSize(80, 20);

		// 월 리스트
		String[] months = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
		JComboBox<String> sL2 = new JComboBox<>(months);
		window2.add(sL2);
		sL2.setLocation(220, 30);
		sL2.setSize(80, 20);

		// 일 리스트
		String[] days = new String[31];
		for (int i = 0; i < 31; i++) {
			days[i] = Integer.toString(i + 1);
		}
		JComboBox<String> sL3 = new JComboBox<>(days);
		window2.add(sL3);
		sL3.setLocation(340, 30);
		sL3.setSize(80, 20);

		btHD1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tf5.setText(tfHD.getText());
				JOptionPane.showMessageDialog(null, "입력되었습니다", "입력 성공", JOptionPane.INFORMATION_MESSAGE);				
				window2.dispose();
			}
		});
		btHD2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				window2.dispose();
				
			}
		});
		btHD3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String year = (String) sL1.getSelectedItem();
				String month = (String) sL2.getSelectedItem();
				String day = (String) sL3.getSelectedItem();
				if(Integer.parseInt(day)< 10) {
					day = "0" + day;
				}
				tfHD.setText(year + "-" + month + "-" + day);
			}
			
		});
	}
	public static void main(String[] args) {
		new GUI3();
	}

}
