package jan.day29.b;

public class ByteToStringEx {

	public static void main(String[] args) {
		String sub = "자바 프로그래밍";
		System.out.println(sub.charAt(3));

		byte[] bytes = { 72, 101, 108, 108, 11 };
		String str = new String(bytes, 1, 2);
		System.out.println(str);

		char[] chars = { 'H', 'e', 'l', 'l', 'o' };
		str = new String(chars);
		System.out.println(str);
	}

}
