package sec02.exam01;

import java.util.Random;

public class LottoExample {

	public static void main(String[] args) {
		//System.out.println(Math.PI);
		
		/*
		 * 난수발생 1번
		for(int i = 0; i < 6; i++) {
			int num = (int) (Math.random()*45 +1);
			System.out.println(num);}*/	
		
		//난수발생 2번
		Random random = new Random(); 
		for(int i=0; i<6; i++) {
			System.out.println(random.nextInt());
		}
		
		
	}

}
