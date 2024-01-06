package sec02.exam09;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 95;
		String grade = (score>90) ? "합격" : "불합격";
			System.out.println(grade);
			
		char grade1;
		if (score > 90) {
			grade1 = 'A';
		}else {
			grade1 = 'B';
		}
		System.out.println(grade1);
		
		
		char grade2 =(score>90) ? 'A' : ( (score>80) ? 'B' :'C' );
		System.out.println(grade2);
	}

}
