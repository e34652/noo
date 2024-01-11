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

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length - 1; j++) {
				if (b[j] > b[j + 1]) {
					// Data swap
					int tmp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = tmp;
					System.out.println("교환" + b[(j - 1)] + "," + b[j]);
					printArr(b);
				}
			}
		}
	}

	public static void main(String[] args) {

		int b[] = { 10, 3, 1, 4, 2 };

		System.out.println(b);
		bubble(b);

		System.out.println("--------------------");
		printArr(b);
	}
}
