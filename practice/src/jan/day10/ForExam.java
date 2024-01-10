package jan.day10;

public class ForExam {

	public static void main(String[] args) {
		
		 /*for (int i=4; 0<i; i--) { for(int j = 0; j<i; ++j) { System.out.print("*"); }
		 System.out.println(); }
		 */

		for (int i = 0; i < 4; i++) {
			for (int j = 4; 0 <= j; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
