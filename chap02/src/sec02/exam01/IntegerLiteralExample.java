package sec02.exam01;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		byte var1 = -128;
		//byte var2 = -129;
		byte var3 = 127;
		//byte var4 = 128;
		short var5 = -32768;
		//short var6 = -32769;
		int var7 =0b1111111;
		System.out.println(var7);
		int var8 = 0X2A;
		System.out.println(var8);
		long var9 = 2100000000L;
		//int var10 = 2150000000;
		char var11 = '각';
		System.out.println(var11);		
		int var12 = '각';
		System.out.println(var12);
		char var13 = '\uac00';
		System.out.println(var13);
		String str = "가\"나\"다\\";
		System.out.println(str);
		float var14 = 0.25f;
		double var15 = 0.25;
		double var16 = 5e2; // 5 x 10^2
		
	}

}
