package jan.day11;

public class Exam5 {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88} 
		};
		
		int sum = 0;
		int count = 0;
		double avg = 0.0;
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double) sum / count; //(array[0].length + array[1].length + array[2].length);
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
