package sec03.exam01;

import java.util.Scanner;

public class GradePrintExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		for(int i=0; i<5; i++) {
			
			System.out.println("이름을 입력하세요");
			String name = scanner.nextLine();
		
			System.out.println("점수를 입력하세요");
			int score = scanner.nextInt();
			scanner.nextLine();
			
			String grade;
			if(score >= 90) {
				grade = "A";
			}else if(score >= 80) {
				grade = "B";
			}else if(score >= 70) {
				grade = "C";
			}else {
				grade = "F";
			}
			System.out.printf("성명: %s, 점수: %d, 등급: %s\n", name, score, grade);
			scanner.close();
		}
	}
}
