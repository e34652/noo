package jan.day10;

import java.util.Scanner;

public class ArrayEx {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열 선언 방법 1 int[] array = new int[] {1, 2, 3, 4}; 
		// 배열 선언 방법 2 int[] array = new int[5];
		
		//배열 크기를 입력받아 만들기
		
		/*
		System.out.print("크기:");
		
		int size = scan.nextInt();
		int[] arr2 = new int[size];
		
		for (int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+ " " );
		}
		*/
		
		// 참고 주소값 복사
		int[] arr5 = null; // null = 메모리 할당 X
		int[] arr6 = new int[5];
		arr5 = arr6; // arr6이 참고하는 주소값을 arr5에 대입 = 같은 주소 참고 
		
		arr5[1] = 100; 
		System.out.print(arr6[1]); // arr6[1]이 참고하는 주소가 arr5[1]와 같다는 점을 확인 가능 
	}
}
