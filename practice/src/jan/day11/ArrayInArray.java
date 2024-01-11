package jan.day11;

import java.util.Scanner;

public class ArrayInArray {

	public static void main(String[] args) {
		int[][] Array = { { 95, 80 }, { 92, 96 } };// 2차원 배열
		for (int row = 0; row < Array.length; row++) {
			for (int column = 0; column < Array[row].length; column++) {
				System.out.printf("(%d, %d): ", row, column);
				System.out.println(Array[row][column]);
			}

			
		}
		auto();
	}

	public static void auto() {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int row = 0;
		int column = 0;
		double avg;
		
		System.out.println("배열의 크기를 입력하세요");
		
		System.out.println("? * ?");
		row = Integer.parseInt(scan.nextLine());
		
		System.out.printf("%d * ?\n", row);
		column = Integer.parseInt(scan.nextLine());
		
		System.out.printf("배열의 크기 = %d * %d\n", row, column);

		int[][] scores = new int[row][column];
	
		for (row = 0; row < scores.length; row++) { // 값 입력부
			for (column = 0; column < scores[row].length; column++) {
				System.out.printf("[%d],[%d]의 항목의 값을 입력해주세요\n", row, column);
				scores[row][column] = Integer.parseInt(scan.nextLine());
			}
		}
		
		
		for (row = 0; row < scores.length; row++) { // 값 출력부 + 합계 누적
			for (column = 0; column < scores[row].length; column++) {
				System.out.print("[" + scores[row][column] + "] ");
				sum += scores[row][column];
			}
			System.out.println();
		}
		/*
		 향상된 for문 
		 for(int[] arr : scores) {
			for(int val : arr) {
				System.out.print("[" + scores[row][column] + "] ");
				sum += val;
			}
		}
		*/
		
		//평균 및 합계 출력
		avg =(double) sum / (row*column);
		System.out.printf("배열의 총 합: %d\n배열의 평균: %f", sum, avg);
		
		scan.close();
	}
}
