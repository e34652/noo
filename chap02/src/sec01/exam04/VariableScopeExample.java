package sec01.exam04;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) { 
			int v2;
			v2 = v1 - 10;
			System.out.printf("var1: %d, var2: %d, var3: %d", v1, v2);
		} //중괄호를 닫으며 해당 블록 마무리
		//int v3 = v1 + v2 + 5; //v2가 선언된 블록 밖이므로 v2 변수를 사용할 수 없음
		//System.out.printf("var1: %d, var2: %d, var3: %d", v1, v2);
		//중괄호는 변수의 수명을 나타내는 것과 같다
	}

}
