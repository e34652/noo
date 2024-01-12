package jan.day11;

public class Bubble1 {

	public static void printArr(int[] b) {

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			if (i < b.length - 1) {
				System.out.print(",");
			}

		}
		System.out.println();
	}

	public static void bubble(int[] b) { // 제일 앞에꺼부터 뒤에꺼랑 비교

		for (int i = 0; i < b.length; i++) {//index는 length -1이므로 -1을 붙여줄 수 있다
			for (int j = 0; j < b.length - 1; j++) {// b.length -1에 -i를 더해 비교할 필요 없는 부분을 생략할 수 있다
				if (b[j] > b[j + 1]) {
					// Data swap
					int tmp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = tmp;
					
					printArr(b);
				}
			}
		}
	}

	public static void main(String[] args) {

		int b[] = { 10, 4, 3, 2, 1 };

		System.out.println(b);
		bubble(b);

		System.out.println("--------------------");
		printArr(b);
	}
}
