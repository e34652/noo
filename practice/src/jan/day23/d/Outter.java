package jan.day23.d;

public class Outter {
	public void  method2(final int arg) { // 자바 8에서는 자동으로 final로 선언이 됨  
		final int localVar = 1;
		//arg = 100; 
		//localVar = 100;
		
		class Inner{
	//개발 시 스레드를 사용하면 메소드가 종료되어도 로컬클래스가 소멸하지 않을 수 있기 때문에, 지역변수가 사라지면 로컬 클래스에 오류가 생기므로 final로 선언됨  
			public void method() {
				int result = arg + localVar; // 
				// 프로세스 = 실행중인 프로그램, 프로세서 = cpu, 스레드 = 경량 프로세스 
			}
		}
	}
}
