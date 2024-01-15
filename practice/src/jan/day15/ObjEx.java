package jan.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Any implements Serializable {//시리얼라이저블 = 덩어리가 한줄씩 파일에 기록되는 방식
	int x;
	String y;
	@Override
	public String toString() {
		return "Any [x=" + x + ", y=" + y + "]";
	}
	
	
}

public class ObjEx {// 책 627페이지

		public static void main(String[] args) throws IOException, ClassNotFoundException {// 객체를 파일로 저장
			Any any = new Any();
			any.x = 100;
			any.y = "가나다";
			System.out.println(any);
			FileOutputStream fos = new FileOutputStream("C:/temp/any.db"); // 저장 경로
			ObjectOutputStream oos = new ObjectOutputStream(fos); // 
			oos.writeObject(any);
			oos.flush();
			oos.close();
		
		FileInputStream fis = new FileInputStream("C:/temp/any.db"); // 저장 경로
		ObjectInputStream ois = new ObjectInputStream(fis); //
		Any any2 = (Any) ois.readObject();
		System.out.println(any2);
	}

}
