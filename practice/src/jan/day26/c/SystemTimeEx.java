package jan.day26.c;

public class SystemTimeEx {

	public static void main(String[] args) { // 성능평가
		long time1 = System.nanoTime(); 
		long time3 = System.currentTimeMillis();
		
		int sum = 0;
		for(int i = 1; i<=1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		long time4 = System.currentTimeMillis();
		
		System.out.println("합" + sum);
		System.out.println((time2-time1) + "나노초 소요");
		System.out.println((time4-time3) + "밀리초 소요");
	}

}
