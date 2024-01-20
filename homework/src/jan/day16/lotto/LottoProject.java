package jan.day16.lotto;

import java.util.Scanner;

public class LottoProject {

	public static int[] getNum(int[] num) {

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
		}
		return num;
	}

	public static int[] dupCheck(int[] num) {

		AAA: while (true) {
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < num.length; j++) {
					if (num[i] == (num[j])) {
						num = getNum(num);
						continue AAA;
					}

				}
			}
			return num;
		}
	}

	public static int[] sortNum(int[] num) {

		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("G를 입력하세요");
		String start = scan.nextLine();
		
		if(start.equalsIgnoreCase("g")){
		int[] num = new int[6];
		getNum(num);
		dupCheck(num);
		sortNum(num);
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		}
	}
}
