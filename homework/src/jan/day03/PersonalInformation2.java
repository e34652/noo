package jan.day03;

import java.util.Scanner;

public class PersonalInformation2 {
//회원가입
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름: __________");
		System.out.println("2. 주민번호 앞 6자리: __________");
		System.out.println("3. 전화번호: __________\n");
		System.out.println("[입력한 내용]");
		
		String name = scanner.nextLine();
		System.out.println("이름 : " + name);

		int id = scanner.nextInt();
		System.out.println("주민번호 : " + id);

		int hp = scanner.nextInt();
		System.out.println("전화번호 : " + hp);

	}
}
