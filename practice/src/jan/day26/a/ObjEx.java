package jan.day26.a;

public class ObjEx {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1.equals(obj2); // equals는 원래 주소값을 비교하는 메서드임 (==와 같음)
		System.out.println(result);// 따라서 내용을 비교하고 싶다면 b의 Member 클래스처럼 재정의를 하는 과정이 필요함 
		
		boolean result2 = (obj1 == obj2);
		System.out.println(result2);

	}

}
