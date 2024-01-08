package jan.day08;

import java.util.Scanner;

public class Project1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.print("학생 수: ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				break;
				
			case 2:
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("점수%d: ", i+1);
					scores[i] = scanner.nextInt();
				}
				break;
				
			case 3:
				for(int i = 0; i < scores.length; i++) {
					System.out.printf("점수%d: %d\n", i+1, scores[i]);
				}
				break;
				
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int score : scores) {
					if(max < score) {
						max = score;
					}
					sum += score;
				}
				avg = (double)sum / scores.length;
				System.out.printf("최고 점수: %d\n", max);
				System.out.printf("총합: %d\n", sum);
				System.out.printf("평균: %f\n", avg);
				break;
				
			case 5:
				System.out.println("종료합니다");
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
