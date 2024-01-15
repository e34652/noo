
package jan.day15;

import java.io.Console;

public class ConsoleEx {

		public static void main(String[]ar) {
			Console con = System.console();
			System.out.println("입력: ");
			String str = con.readLine();
			System.out.println(str);
			System.out.println("입력: ");
			str = con.readLine();
			System.out.println(Integer.parseInt(str));
			System.out.println("암호: ");
			char[] charPass = con.readPassword();
			String strPass = new String(charPass);
			System.out.println(strPass);
		}
}
