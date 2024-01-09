package sec04.exam01;

import java.util.Scanner;

public class Integration {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String id = scan.nextLine();
		String pw = scan.nextLine();
		int age = scan.nextInt();
		Account acc = new Account(scan, id, pw, age);
		System.out.println(acc);
		
	}

}
