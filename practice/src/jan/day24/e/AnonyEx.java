package jan.day24.e;

public class AnonyEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.turnOn();
		anony.method1();
		anony.method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("스마트 TV를 켜다");
				
			}

			@Override
			public void turnOff() {
				System.out.println("스마트 TV를 끄다");
				
			}
			
		});
	}
}
