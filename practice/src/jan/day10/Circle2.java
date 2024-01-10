package jan.day10;

public class Circle2 {
	int radius;
	
	public Circle2(int radius) {
		this.radius = radius;
	}
	
	void set(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circle2 cir1 = new Circle2(2); // 객체 생성
		Circle2 cir2 = cir1; // cir1과 같은 값을 참고하게 함
		System.out.println(cir1.radius);
		
		cir1.set(4); // cir1과 cir2는 같은 주소를 참고하므로 둘다 값이 바뀜
		System.out.println(cir1.radius);
		cir1.set(5);
		System.out.println(cir1.radius);
		cir1.set(6);
		System.out.println(cir1.radius);
		
	}
}
