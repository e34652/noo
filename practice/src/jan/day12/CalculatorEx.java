package jan.day12;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.execute();
		//myCalc.plus(); << private 메소드이므로 외부에서 호출,접근 불가능
		myCalc.avg(3, 3);
	}

}
