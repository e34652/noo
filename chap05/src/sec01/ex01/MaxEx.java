package sec01.ex01;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		int max = 0;
		int index = 0;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("몇개의 숫자를 비교하겠습니까"); // 항목의 개수 입력
		int count = scan.nextInt();
		int[] intNum = new int[count];

		for (int i = 0; i < intNum.length; i++) {//각 항목의 값 입력
			System.out.print("정수입력: ");
			int inputNum = scan.nextInt();
			intNum[i] = inputNum;
		}

		for (int val : intNum) { // 배열의 각 항목을 max의 값과 비교
			if (val > max) {// 최대값
				max = val;
			}
			;
		}
		System.out.println("최대값: " + max);
		
		// int[] array = { 1, 5, 3, 8, 2 };

		/*
		 * for (int i = 0; i < array.length; i++) { if (max < array[i]) {//max와 배열의 i번째
		 * 항목의 값을 비교 max = array[i]; // max보다 큰 값을 계속해서 저장하면 마지막에는 가장 큰 값이 저장되어 있음 index
		 * = i; } }
		 * 
		 * int i = 0; for(int num : array) { if(num > max) { max = num; index = i; }
		 * i++; }
		 * 
		 * System.out.println("최대값: " + max); System.out.println("인덱스: " + index);
		 */
	}
}
