package jan.day17.banking;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Scanner scanner = new Scanner(System.in);
		SaveLoad sl = new SaveLoad();
		Check check = new Check();

		if (check.find() == FileCheck.EXIST) {
			sl.load();
		}
		boolean run = true;
		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.회원출력 | 2.회원등록 | 3.리스트 초기화 | 4.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scanner.nextLine());
			switch (menuNum) {
			case 1:
				System.out.println("회원출력");
				if (sl.getList().isEmpty()) {
					System.out.println("회원 리스트가 비어있습니다");
				} else {
					for (Account account : sl.getList()) {
						System.out.println(account);
					}
				}
				break;
			case 2:
				System.out.println("회원등록");
				System.out.print("이름:");
				String name = scanner.nextLine();
				System.out.print("아이디:");
				String id = scanner.nextLine();
				System.out.print("패스워드:");
				String pass = scanner.nextLine();
				System.out.print("전화번호:");
				String tel = scanner.nextLine();
				System.out.print("생년월일:");
				String ssn = scanner.nextLine();
				sl.getList().add(new Account(name, id, pass, tel, ssn));
				sl.save();
				break;
			case 3:
				System.out.println("리스트 초기화");
				sl.reset();
				break;

			case 4:
				System.out.println("프로그램 종료");
				run = false;
				sl.save();
				break;
			}
		}

	}
}