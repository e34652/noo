package jan.day24.d;

public class AnonyEx {

	public static void main(String[] args) {
	Anonymous anony = new Anonymous();
	anony.field.wake();
	
	anony.method1();

	//anony.method2(new Person()); << 정석 
	anony.method2(new Person() { // << 자식객체도 업캐스팅이 되므로 부모 타입 객체로 대체 가능 
		void study() { 
			System.out.println("공부");
			
		}

		@Override
		void wake() { 
			System.out.println("8시 기상");
			study(); // << 익명자식객체 고유의 데이터이므로 외부에서는 절대로 호출 불가능 << 자식 객체의 클래스를 모르는데 어떻게 호출하거나 다운캐스팅을 해서 불러오겠음! 
		}
		});
	}

}
