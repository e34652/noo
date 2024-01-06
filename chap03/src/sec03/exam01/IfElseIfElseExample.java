package sec03.exam01;

import java.util.Scanner;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");

		int score = scanner.nextInt();
		int score1 = score / 10;
		String grade = "";

		switch (score1) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "D";
		}

		/*
		 * if(score>=90) { grade = "A"; }else if(score>=80) { grade = "B"; }else
		 * if(score>=70) { grade = "C"; }else { grade = "D"; }
		 */

		System.out.printf("점수: %d \n등급: %s", score, grade);
	}

}
