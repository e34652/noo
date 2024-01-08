package sec01.ex01;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] scores = {83, 93, 73}; // 배열초기화 방법 1 직접 리터럴을 입력
		System.out.println(scores.length);
		
		Scanner scan = new Scanner(System.in);// 위의 방법보다 확장성이 더 좋은 코드
		System.out.print("생성할 정수 배열의 개수: ");
		int num = scan.nextInt();  
		
		int[] scores1 = new int[num]; // 배열 초기화 방법 2, 정수 초기값 0
		//scores1[0] = 83; 항목에 리터럴을 직접 지정하는 방법 2
		//scores1[1] = 93;
		//scores1[2] = 73;
		// [] << 배열 표시가 있으면 참조 타입이 됨
		for(int i=0; i<3; i++) { // i<3 = i<length.scores1
			System.out.println(scores1[i]);
		}
		//System.out.println(scores1[0]); 위의 for 문과 동일한 결과
		//System.out.println(scores1[1]);
		//System.out.println(scores1[2]);
		//System.out.println(scores1[3]); << ArrayIndexOutOfBoundsException 배열의 인덱스 범위를 벗어난 예외
		
		String[] names = new String[5]; // [N]배열의 항목 수를 나타냄, 참조타입 초기값 null
		
		for(int i=0; i<5; i++) { // i<5 = i<length.names
			System.out.println(names[i]);
		}

	}

}
