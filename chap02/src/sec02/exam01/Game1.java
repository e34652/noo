package sec02.exam01;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
	public static int createNumber(Random random) {
		//Random random = new Random();
		return random.nextInt(10) + 1;
	}

	public static void multiplication() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = createNumber(random);
		int num2 = random.nextInt(10)+ 1;
		int multi = num1 * num2;

		System.out.printf("%d X %d = ?\n", num1, num2);
		for (int i = 0; i < 3; i++) {
			System.out.print("입력");
			// String answer = scan.nextLine();
			int answer1 = Integer.parseInt(scan.nextLine());
			if (answer1 == multi) {
				System.out.println("정답!");
				break;
			} else {
				System.out.println("오답!");
			}
		}
	}

	public static void howmany(int x) {
		for (int i = 0; i < x; i++) {
			multiplication();
		}
		System.out.println("종료");
	}

	public static void main(String[] ar) {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("몇 번?");
		int a = scan1.nextInt();
		
		howmany(a);
	}
}
