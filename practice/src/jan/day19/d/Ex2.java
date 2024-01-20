package jan.day19.d;

interface Inter{
	void disp();
}

public class Ex2 {

	public static void main(String[] args) { // 익명 객체는 해당 블록을 벗어나면 사라지는 지역변수와 비슷함 
		Inter it = new Inter() { // 인터페이스 Inter을 구현한 객체를 생성하겠다(익명 구현 객체)  << 일종의 클래스 생성 하지만 따로 파일이 남지 않음 
			int y = 100; // 필드
			
			public void disp2() {
				System.out.println("disp2");
			}
			
			@Override
			public void disp() { // 오버라이드 된 메소드
				System.out.println(y);
				
			}
		};
		// it. 을 해도 disp2와 필드 y를 불러올 수 없음 , 해당 블록을 벗어나면 없어지는 느낌 

	}

}
