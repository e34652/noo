package jan.day26.b;

public class MemberEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");//obj1과 2는 각각 다른 메모리주소에 저장되어있는 두 객체이지만 식별요소가 같기에 같은 객체로 식별됨 
		Member obj2 = new Member("blue");//그럼 완전히 다른 객체도 식별 요소만 똑같게 만들어주면 같은 객체로 인식하게 되나
		Member obj3 = new Member("red");// 이렇게 하는 목적은 무엇인가 실제로 어디에 적용될 수 있나 
		System.out.println(obj1);
		System.out.println(obj1.toString());
		
		System.out.println(obj1.hashCode()); // << 해시코드를 정수값으로 
		System.out.println(obj2.hashCode());  
		System.out.println(obj3.hashCode()); 
		
		if(obj1.equals(obj2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
