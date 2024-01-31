package jan.day29.d;

public class StringTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str = "";
		
		long time1 = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			sb.append("a"); // 4 << 성능이 수백배 좋음 
//			str +="a"; 600
//			str = str.concat("a"); 700
		}
		long time2 = System.currentTimeMillis();
		System.out.println("연산시간: " + (time2-time1) + " msec");
	}

}
