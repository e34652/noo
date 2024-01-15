package jan.day15;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjEx2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		FileInputStream fis = new FileInputStream("C:/temp/any.db"); // 저장 경로
		ObjectInputStream ois = new ObjectInputStream(fis); //
		Any any2 = (Any) ois.readObject();
		System.out.println(any2);

	}

}
