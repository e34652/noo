package jan.day11;

public class ArrayPassing {

	public static void increase(int arr[]) {
		for (int i=0; i<arr.length; i++) {
			arr[i]++; //객체이므로 Call by Reference가 일어나 해당 참조 대상의 주소와 연동되어 변경사항이 해당 주소에 반영됨
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		increase(a);
		increase(new int[] {1,2,3,4});
		for (int n : a) {
			System.out.println(n);
		}
	}
}
