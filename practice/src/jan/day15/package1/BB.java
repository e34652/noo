package jan.day15.package1;

public class BB {
	
	public BB() {
		AA aa = new AA();
		aa.field1 = 1;
		aa.field2 = 1;
		//aa.field3 = 1; << private 필드
		
		aa.method1();
		aa.method2();
		//aa.method3(); << private 메소드
	}
	
	
	public void method1() {}
	void method2 () {}
	private void method3() {}
}
