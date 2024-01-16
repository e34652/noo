package jan.day16;

import java.util.ArrayList;
import java.util.List;


public class ArrayListEx {

	public static void main(String[] args) { // 문자열을 가변적인 배열로 << 인덱스가 고정적이지 않음
		String[] strArr = new String[100];
		ArrayList<String> aList = new ArrayList(); // 원형
		List<String> list = new ArrayList<>(); // 축약형, <제네릭> 제네릭은 형판과 같은 개념, <String> String 타입을 저장할 수 있는 리스트  
		// List가 ArrayList의 부모 클래스이므로 업캐스팅이 가능함
		list.add("문");
		list.add("곰");
		list.add("문곰");
		for(String str : list) {
			System.out.println(str);
		}
		list.set(1,"곰곰");
		for (String str : list) {
			System.out.println(str);
		}
		
	}

}
