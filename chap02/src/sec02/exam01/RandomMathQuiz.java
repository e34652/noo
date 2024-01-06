package sec02.exam01;

import java.util.Scanner;

public class RandomMathQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int L = 10;
		String Lstring;
		int num1;
		int num2;
		while(true) {
			num1 = (int) (Math.random()*L + 1);
			num2 = (int) (Math.random()*L + 1);
			System.out.printf("%d * %d = ?\n답은?", num1, num2);
			int answer = scanner.nextInt();
			if(answer == num1 * num2) {
				System.out.print("정답!! L을 입력해 난이도 업!!");
				scanner.nextLine();
				Lstring = scanner.nextLine();
				if(Lstring.equalsIgnoreCase("L")){
					L = L*10;
				}else{
					break;
				}
			}else{
					System.out.print("땡!! \n답은?");	
					answer = scanner.nextInt();
			}
		}
	}	
}
