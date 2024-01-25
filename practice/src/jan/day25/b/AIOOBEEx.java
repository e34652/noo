package jan.day25.b;

public class AIOOBEEx {

	public static void main(String[] args) {
		try {
			
		
		
		String str = args[0];
		String str1 = args[1];
		String str2 = args[2];
		
		System.out.println(str);
		System.out.println(str1);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());//예외 메시지 만들어주는 메소드
			System.out.println("예외 발생");
		}//try catch 또는 조건문을 통해 예외 상황 예방
	}

}
