package sec04.exam02;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
		int keyCode;
		for(;;) {
			System.out.print("입력>");
			keyCode = System.in.read();
			System.out.println(keyCode);
			if (keyCode == 113) { 
				break;//q를 입력하면 break
			}
		}
		
		System.out.println(keyCode);
	}
}
