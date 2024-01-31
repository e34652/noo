package jan.day29.h;

public class StringTrimEx {

	public static void main(String[] args) {
		//앞 뒤 공백 제거
		String str = "             가나 다           ";
		System.out.println(str.length());
		System.out.println(str.trim().length());
		System.out.println(str.trim());

		String str1 = String.valueOf(10.5);
		System.out.println(str1 + 30);
	}

}
