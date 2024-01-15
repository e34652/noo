package jan.day15;

public class StaticMember {
	int field1;

	void method1() {
	}

	static int field2; // static = 메모리가 할당된 상태

	static void method2() {
	}

	static void method3() {// static 메소드는 로딩 즉시 메모리 할당되므로 메모리가 할당되지 않은 인스턴스 필드는 사용이 불가능함 << 스태틱을 사용하려 할 때 인스턴스가 로딩이 안되어있으면 사용이 불가능하므로
		StaticMember sm = new StaticMember();
		//field1 = 10; // 인스턴스 필드 << 실행 불가능 << 인스턴스가 붙으면 객체를 생성 후 사용 가능
		sm.field1 = 10; // 객체 생성 후 해당 인스턴스 안의 멤버는 메모리가 할당되므로 field1은 사용가능함 << 오류 X 
		field2 = 10; // 스태틱 필드 << 실행 가능
		System.out.println(sm.field1);
		System.out.println(StaticMember.field2);
		// 따라서 스태틱 메소드에서는 스태틱 멤버는 바로 불러 쓸 수 있지만 인스턴트 멤버는 객체를 생성해야함
	}//당장 출정해야하는 부대에 밥도 안먹인 병사가 있으면 편성이 잘못되었기 때문에 오류가 생김
	
	void method4() { // 인스턴스 메소드는 객체 생성 후 사용할 수 있기 때문에 인스턴스 필드가 들어가도 괜찮음 
		field1 = 10;
		StaticMember.field2 = 10; // 스태틱 필드이므로 클래스를 통한 직접적인 접근 가능
	}
}
