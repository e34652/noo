package sec01.ex01;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();

			if(selectNo == 1) {//학생 수 입력(배열 항목 수)
				System.out.print("학생 수를 입력해주세요");
				studentNum = scanner.nextInt();
				scores = new int [studentNum]; 
				System.out.printf("학생 수> %d\n",studentNum);
		
			}else if(selectNo == 2) {//각 항목에 점수 입력
				for(int i = 0; i<scores.length; ++i) {
					System.out.printf("학생%d의 점수를 입력해주세요",i+1);
					scores[i] = scanner.nextInt();
					System.out.printf("학생%d: %d\n", i+1, scores[i]);
				}
				
			}else if(selectNo == 3) {//배열의 각 항목 출력
				int i = 1;
				for(int list : scores) {
					System.out.printf("학생%d의 점수: %d\n", i, list );
				i++;}
			}else if(selectNo == 4) {//최고 점수, 평균 점수 출력
				int max = 0;
				int sum = 0;
				double avg = 0;
			for(int score : scores) {
				if(max < score) {
					max = score;
				}
				sum += score;
			}
			avg = sum / scores.length;
			System.out.printf("최고 점수: %d\n 평균 점수: %f\n", max, avg);	
				
			}else if(selectNo == 5) {//종료
				run = false;
			}		
		}
		System.out.println("프로그램 종료");
	}
}
