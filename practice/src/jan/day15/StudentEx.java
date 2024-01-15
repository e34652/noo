package jan.day15;

public class StudentEx {

	public static void main(String[] args) {
		StudentService ss = StudentService.getInstance();
		//게터세터를 쓴다면?
		
		ss.getStudent().name = "문";
		ss.getStudent().studentNum = "123123";
		ss.getStudent().kor = 92;
		ss.getStudent().eng = 86;
		ss.getStudent().math = 95;


		StudentService ss1 = StudentService.getInstance();
		System.out.println(ss.getStudent().name);
		System.out.println(ss.getStudent().name);
		if(ss.getStudent().equals(ss1.getStudent())) {
			System.out.println("같은 객체의 주소를 참조중");
		}
		
		if(ss.getStudent() == ss1.getStudent()) {
			System.out.println("같은 객체의 주소를 참조중");
		}
	}

}
