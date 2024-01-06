package sec03.exam01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inputData; 
		
		while(true) {
			System.out.print("입력>");
			inputData = scan.nextLine(); // 엔터를 치면 입력된 값이 엔터를 제외하고 문자열 데이터로 입력됨
			System.out.printf("입력된 문자열:%s\n", inputData);
			System.out.print(inputData.equals("q"));
			if(inputData.equals("q")) {
				break; //입력된 문자열이 q라면 반복문을 빠져나감
			}
		}
		System.out.println("종료");
	}

}
