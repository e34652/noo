package jan.day22.aa;

public class AaEx {
	public static void main(String[]args) {
		Aa.method2();
		Aa.B b = Aa.field3; // A클래스의 B타입 클래스 타입 필드 b에 이미 생성되어있는 B 타입 필드 변수의 참조값 대입
		Aa.C c = Aa.field4; // A클래스의 C타입 클래스 타입 필드 c에 이미 생성되어있는 B 타입 필드 변수의 참조값 대입
		// 스태틱 필드이므로 가능함
		Aa.field3.method12();
		Aa a = new Aa();
		a.method1();
		Aa.B b1 = a.field1;
		Aa.C c1 = a.field2;
		// 스태틱 필드가 아니므로 불가능함
	}
}
