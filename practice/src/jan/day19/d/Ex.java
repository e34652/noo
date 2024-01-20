package jan.day19.d;

class AnyClass{
	void mmm() {};
}
public class Ex {

	public static void main(String[] args) {
		AnyClass ac = new AnyClass() {
			// 익명의 AnyClass를 상속한 자식 객체를 생성하겠다  << 중괄호 이후는 자식 객체의 클래스 블록
			// 중괄호에서 생성된 자식 클래스가 ac라는 부모타입 객체로 업캐스팅되어 부모 타입 객체로 생성되지만 어떤 자식이 업캐스팅되어 들어가는지 알 수 없음  << 익명
			@Override  
			void mmm() {
				
				super.mmm();
			}  
			
		};

	}

}
