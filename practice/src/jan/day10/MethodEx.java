package jan.day10;

public class MethodEx {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4 ,5};
		int n = sum(a); // 매개값이 배열변수
		System.out.println(n);
		
	}
	

	public static int sum(int[] x) { // 매개변수도 배열로 받음
		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum;
	}

}
