package jan.day11;

public class MainEx {

	public static void main(String[] ar) { // ar값은 cmd java -cp 디렉토리.class파일명 매개값1 매개값2 의 방식으로 입력 가능 
		if (ar.length !=2) {
			System.out.println("값의 수가 부족합니다");
			System.exit(0);
		}
		String str = ar[0];
		System.out.println(str);
		
	}
}
