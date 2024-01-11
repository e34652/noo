package jan.day11;

public class Bubble2 {

	public static void bubble(int[] b) {// 뒤에서부터 비교
		for (int i = 0; i < b.length; i++) {
			for (int j = b.length - 1; j > i; j--) {
				if (b[j] < b[j - 1]) {
					int tmp = b[j];
					b[j] = b[j - 1];
					b[j - 1] = tmp;
					System.out.println("교환" + b[(j - 1)] + "," + b[j]);
					printArr(b);

				}
			}
		}
	}
/*
    static void bubbleSort(int[] arr) {//한칸 앞에서부터 뒤에꺼랑 비교 
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    */
	public static void printArr(int[] b) {

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
			if (i < b.length - 1) {
				System.out.print(",");
			}

		}
		System.out.println();
	}

	public static void main(String[] args) {

		int b[] = { 10, 3, 2, 4, 1 };
		bubble(b);

		System.out.println("--------------------");
		printArr(b);
	}
}