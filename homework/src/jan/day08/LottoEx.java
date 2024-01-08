package jan.day08;

import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		int[] lotto = new int[6]; // index = 0~5 총 6개 << 인덱스는 0부터 시작 항목은 1부터 시작
		Random ran = new Random();
		
		for (int i=0; i<lotto.length; i++) {
		lotto[i] = ran.nextInt(45)+1;
		System.out.println(lotto[i]);
		}
		
		System.out.println("-----------------------------");
		for (int val : lotto) {//index를 여러개 활용 안할 경우에 사용
			System.out.println(val);
		}
	}
}
