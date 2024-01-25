package jan.day25.b;

public class NFEEx {

	public static void main(String[] args) {
		try{
		int x = Integer.parseInt("aa");
		System.out.println(x);
		
		}catch(NumberFormatException e) {
			System.out.println("예외");
		}
	}

}
