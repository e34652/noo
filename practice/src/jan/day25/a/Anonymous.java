package jan.day25.a;

public class Anonymous {
	int field;
	void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		//arg1 = 20; 중첩클래스에서 활용되는 변수는 final 특성을 가지게 됨 
		//var2 = 20;
		
		field = 10;
		Calculatable calc = new Calculatable() {
			
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		//int x = calc.sum();
		System.out.println(calc.sum());
	}	
	
	public static void main(String[] ar) {
		Anonymous anony = new Anonymous();
		anony.method(10, 10);
	}
}
