package sec04.exam06;

public class CalculatorExam {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		//정사각형의 넓이 구하기
		double result1 = cal.areaRectagle(10);
		
		//직사각형의 넓이 구하기
		double result2 = cal.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형 넓이 = " + result1);
		System.out.println("직사각형 넓이 = " + result2);

	}

}
