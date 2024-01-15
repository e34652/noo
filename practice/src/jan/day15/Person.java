package jan.day15;

public class Person {
	
	final static public double PI = 3.141592; // 보통은 public static을 먼저쓰지만 순서가 바뀌어도 오류가 생기지는 않음, 타입만 마지막에 잘 쓰면 됨
	final String name;
	
	
	public Person(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		System.out.println(Math.PI); // 이미 대부분은 API가 있음 
//		person.name = "홍길동"; final이 붙으면 초기화를 단 한번만 할 수 있음 << 변수 선언시 초기화를 안한 경우 생성자를 통해 초기화 할 수 있는 기회가 있음 
		Person person = new Person("문"); // 처음 객체를 생성하며 초기화를 할때 생성자의 매개 변수를 대입해 초기화 가능
		
		final int x; // 필드만이 아니라 변수와 그 외 모든 것들에 다 적용됨
		x = 300;
		//x = 500; 초기화는 한번만 가능


	}

}
