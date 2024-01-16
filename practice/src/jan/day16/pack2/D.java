package jan.day16.pack2;

import jan.day16.pack1.A;

public class D extends A {
	
	
	public D() {
		super(); // 부모의 생성자 A는 protected 이기에 자식 클래스에서 실행이 가능함 (extends A)
		this.field = "value"; // 부모객체와 같은 주소값을 가짐 << 복사가 아니라 공유의 개념 
		this.method();
	}

	/*public void method() {
		A a = new A(); // protected 이므로 접근제한 : 같은 패키지 내 + 자식 클래스만 가능
		a.field = "value";
		a.method(); */
	}

