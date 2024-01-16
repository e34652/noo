package jan.day16;

import java.util.ArrayList;
import java.util.List;

class Student1 {
	String name;
	int kor;
	
	public Student1(String name, int kor) {
		this.name = name;
		this.kor = kor;
	}

	@Override
	public String toString() {
		return name + " " + kor;
	}

}

public class ArrayListEx1 {

	public static void main(String[] args) { // 문자열을 가변적인 배열로 << 인덱스가 고정적이지 않음
		Student1[] strArr = new Student1[100];
		List<Student1> slist = new ArrayList<>(); // 축약형, <제네릭> 제네릭은 형판과 같은 개념, <String> String 타입을 저장할 수 있는 리스트
		// List가 ArrayList의 부모 클래스이므로 업캐스팅이 가능함
		slist.add(new Student1("문곰문곰",90));
		slist.add(new Student1("문곰문",92));
		slist.add(new Student1("문곰",91));
		for(Student1 student1 : slist) {
			System.out.println(student1);
		}
	}
}
