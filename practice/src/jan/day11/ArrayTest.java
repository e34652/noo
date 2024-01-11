package jan.day11;

public class ArrayTest {

	public static void main(String[] args) {
		onetwothree();

		fourfivesix();

	}

	public static void onetwothree() {
		int[] a = { 1, 3, 10, 2, 8 };

		// 1번문제
		int sum1 = 0;
		for (int a1 : a) { //변수명은 대문자를 쓰지 않는 것이 관례이다
			sum1 += a1;
		}
		System.out.printf("1번 답: %d\n", sum1);

		// 2번 문제
		double avg = (double) sum1 / a.length;
		System.out.printf("2번 답: %f\n", avg);

		// 3번 문제
		int max = 0;
		for (int a1 : a) {
			if (a1 > max) {
				max = a1;
			}
		}
		System.out.printf("3번 답: %d\n", max);
		System.out.print("\n");
	}
	
	public static void fourfivesix() {
		int[] a = { 10, 3, 1, 4, 2 };
	
		// 4번 문제
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 4) {
				//System.out.println(i); << 이렇게 하는 경우 코드의 확장이 불가능하므로 좋지 않다
				index = i;// 해당 값을 변수에 대입함으로써 더욱 다양한 활용이 가능해진다
			}
		}
		if(index != -1) {//원하는 값이 들어있는 항목이 없는 경우를 고려한 확장
		System.out.printf("4번 답: %d번 index\n", index);
		}else {	
			System.out.println("못찾음");
		}
		// 5번 문제
		int x = 10;
		int y = 20;
		int tmp = 0;
		System.out.printf("5번 답: x = %d, y = %d 에서\n", x, y);

		tmp = x;
		x = y;
		y = tmp;
		System.out.printf("\tx = %d, y = %d\n", x, y);

		// 6번 문제
		for (int i = 0; i < a.length; i++) { // 맨 뒤에 것부터 한칸 앞에 값과 비교 i<j의 의미는 의미없는 비교를 줄여 최적화 하기 위함
			for (int j = a.length-1; i < j; j--) {
				if (a[j-1] > a[j]) {
					tmp = a[j-1];
					a[j-1] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		System.out.print("6번 답: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print(",");
			}
		}
	}
}
/*
for (int i = 0; i < a.length-1; i++) { // 한칸 앞에 것부터 뒤의 값과 비교해서 스왑  
	for (int j = 1; j < a.length; j++) {
		if (a[j-1] > a[j]) {
			tmp = a[j-1];
			a[j-1] = a[j];
			a[j] = tmp;
		}
	}
}

		
for (int i = 0; i < a.length; i++) { // 맨 앞부터 뒤에 값과 비교해서 스왑
	for (int j = 0; j < a.length - 1; j++) {
		if (a[j] > a[j + 1]) {
			tmp = a[j];
			a[j] = a[j + 1];
			a[j + 1] = tmp;
		}
	}
}
*/


