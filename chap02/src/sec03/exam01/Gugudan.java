package sec03.exam01;

import java.util.Scanner;
public class Gugudan {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("원하는 단을 입력하세요 (q입력시 종료)");
			String str = scanner.nextLine();
			if(str.equals("q")) {
				System.out.println("종료");
				break;
			}else {
				int dan = Integer.parseInt(str);
				System.out.printf("%d단\n", dan);
				int result = 0;
				for(int i=1; i<=9; i++) {
					result = dan * i;
					System.out.printf("%d X %d = %d\n", dan, i, dan*i);
				}
				System.out.println("");
			}
		}
	}
}
