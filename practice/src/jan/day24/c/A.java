package jan.day24.c;

class Parent{
	void pMethod() {}
}

public class A {
	Parent field = new Parent() {
		int childField;
		void childMethod() {
			
		}
	}; // 익명 자식 객체를 생성해 필드에 참조값 대입  
	void method() {
		this.field.pMethod(); // 익명의 자식객체이므로 자식객체 고유의 데이터는 접근 불가 << 부모 타입이므로 
	}
}
