package jan.day23.f;

import jan.day23.f.Outter.Nested;

public class Ex {

	public static void main(String[] args) {
		Outter outter = new Outter();
		Nested nested = outter.new Nested(); 
		nested.print();

	}

}
