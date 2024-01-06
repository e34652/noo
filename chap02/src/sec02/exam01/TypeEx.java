package sec02.exam01;

public class TypeEx {

	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		//byte sum = (byte)value1 + (byte)value2;
		byte var1 = 100; // byte < int 자동타입변환 가능		
		int var2 = 129;
		long var3 = 1000000000L;
		float var4 = var3;
		
		int intValue = 10;
		double doubleValue = 5.5;
		//int result = intValue + doubleValue;
		
		String str = 10 + 2 + "";
		String str1 = String.valueOf(10+2);
		String str2 = "" + 10 + 2;
		String str3 = "" + (10 + 2);
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		var1 = (byte) var2;
		System.out.println(var1);
		
		int num1 = Integer.parseInt(str2);
		
		String a = "3.9";
		double result = Double.parseDouble(a);
		int result3 = (int)Double.parseDouble(a);
		System.out.println(result);
				
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		
	short s1 = 1 + 2;
	double s2 = (double)(s1 + 1);
	System.out.println(s2);
		
	}

}
