package jan.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerArrayList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String menuNum = "";

		String[] strArr = new String[100];
		ArrayList<String> List = new ArrayList(); //
		List<String> list = new ArrayList<>();

		boolean run1 = true;
		while (run1) {

			System.out.println("---------------------------------------------------");
			System.out.println("1.회원 출력 | 2.회원 등록 | 3.파일 저장 | 4.파일 읽기 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("원하시는 메뉴의 숫자를 입력해주세요");

			menuNum = scan.nextLine();
			switch (menuNum) {

			case "1":
				System.out.println("회원출력");
				break;
			case "2":
				System.out.println("회원등록");
				break;
			case "3":
				System.out.println("파일저장");
				break;
			case "4":
				System.out.println("파일읽기");
				break;
			case "5":
				System.out.println("종료");
				run1 = false;
				break;
			}
		}
	}
}
