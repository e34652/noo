package jan.day19.d;

class Parent{
	void method() {}
}

public class Child extends Parent{
	
	@Override
	void method() {
		// TODO Auto-generated method stub
		super.method();
	}

	public static void main(String[] args) {
						   
		Parent parent = new Parent() { // 이것은 하나의 메소드, 메소드를 벗어나면 해당 블록 내에서만 선언된 모든 데이터는 지워짐 
			//new = 생성자를 불러오겠다 ( 누구의 생성자?) 
			//Parent = Parent 클래스를 상속하는 
			//() 뒤에 나올 중괄호 안에서 정의될 자식 클래스의 생성자를
			//합치면 뒤에 나올 중괄호 안에서 정의되는 자식 클래스의 생성자를 불러와 
			//익명 자식 객체를 생성하겠다 
			//중괄호 = 자식 객체의 클래스 블록과 같음 = 자식 클래스를 직접 코딩하는 것과 같음 
			//new Parent() = ()는 생성될 Parent를 상속한 익명 객체의 생성자를 불러옴
			//따라서 Parent() {} = Parent를 상속한 자식 객체의   
			//Parent 생성자로 만들어진 << Parent의 익명 자식 객체를 생성하겠다   
			
			//우리말이 아 다르고 어 다른 것처럼 세미콜론과 중괄호가 의미하는 바가 다름, 우리가 배우고 있는 건 프로그래밍의 언어라는 부분을 명심하자 
			//업캐스팅 된 익명 자식 클래스가 parent 라는 부모타입 변수에서 참조되지만 부모 타입 객체로 생성되지만 어떤 자식이 업캐스팅되어 들어가는지 알 수 없음  << 익명
			@Override
			void method() {
				
				super.method();
			} 
			
		
		};
		Child child = (Child) parent; // 나중에 자식 클래스로 다운 캐스팅을 할 때 업캐스팅 됐던 자식을 찾아 형변환을 해야하는데 찾을 수 없으므로 다운캐스팅 불가능
	}
}
