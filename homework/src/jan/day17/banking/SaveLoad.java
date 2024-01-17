package jan.day17.banking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SaveLoad {
	private List<Account> list = new ArrayList<>();

	public List<Account> getList() {
		return list;
	}

	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("C:/temp/list.db"); // 저장 경로
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(list); // 저장될 객체에 implements Serializable 필수 
		oos.flush();
		oos.close();
	}

	public List load() throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:/temp/list.db"); // 저장 경로
		ObjectInputStream ois = new ObjectInputStream(fis); 
		this.list = (List<Account>) ois.readObject(); // 불러온 데이터를 저장할 객체

		return list;
	}

	public void reset() throws IOException {
		this.list.clear();
	}
}