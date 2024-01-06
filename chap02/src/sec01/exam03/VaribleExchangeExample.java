package sec01.exam03;

public class VaribleExchangeExample {

	public static void main(String[] args) {
		//자료교환(swap)
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);
		
		int temp= x;
		x = y;
		y = temp;
		System.out.printf("x: %d, y: %d\n", x, y);
		//=System.out.println("x: " + x + ", y: " + y);

	}

}