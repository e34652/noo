package sec01.ex01;

public class StackEx {

	public static void main(String[] args) {
		int age = 32;
		
		String name = "kang";
//		int[] intArray = null;
//		intArray[0] = 10;
		
		//String str = null;
		//System.out.println(str.length());
		
		String name1 = "신용권";
		String name2 = "신용권";
		System.out.println(name1.equals(name2)); // 리터럴 비교
		System.out.println(name1 == name2); // 참조번지 비교
		
		String name3 = new String("신용권");
		String name4 = new String("신용권");
		
		System.out.println(name3.equals(name4)); // 리터럴 비교
		System.out.println(name3 == name4); // 참조번지 비교
	}

}