package sec01.ex01;

public class Exam05 {

	public static void main(String[] args) {
		// int[] array2 = {80, 78, 97}; 아래와 같은 결과
		double[] array = new double[] { 83.6, 90.0, 87.2 };

		// 총점, 평균 출력
		double sum = 0;
		double average = 0;
		/*for(int i=0; i<array.length; i++) {
			sum = array[i] + sum;
		}
		average = sum / array.length;
		System.out.printf("총합: %d\n 평균: %f", sum,average);
		*/
		for(double val : array) {
			sum = sum + val;
		}
		average = sum / array.length;
		System.out.printf("총합: %f\n 평균: %f", sum,average);
	}

}
