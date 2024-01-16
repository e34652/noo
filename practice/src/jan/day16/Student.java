package jan.day16;

public class Student extends People{
	String name;

	public Student(String name) {//super. << 부모가 가진 멤버를 호출하는 방법, 이미 상속이 되었기 때문에 super가 없어도 사용이 되지만 명시적으로 해주는게 좋다
		//super(name); << super(name); 생략시 기본 생성자 호출, 없을경우 컴파일 에러 // 부모의 생성자 호출 (부모 클래스에 지정된게 없으면 기본생성자)
		//this() 내가 가진 메소드 중에 매개변수의 타입 개수 순서가 일치하는 메소드 찾기 , super() 부모가 가진 메소드중에 이름 + 타 개 순 일치하는 메소드 찾기
		this.name = name;
	}

	@Override // 메소드 재정의 = 내 것도 쓰고 부모 것도 쓰고 부모의 메소드 base + 자식 메소드의 추가내용  
	void method1() { 
		System.out.println(); 
		super.method1(); //this() 내가 가진 메소드 중에 매개변수의 타입 개수 순서가 일치하는 메소드 찾기 , super() 부모가 가진 메소드중에 타 개 순 일치하는 메소드 찾기
	} 
	
	
}
