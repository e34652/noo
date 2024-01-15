package jan.day15;

public class StudentService {
	private Student student = new Student();
	private static StudentService studentService = new StudentService();
	
	private StudentService() {
	
	}
	public static StudentService getInstance() {
		
		return studentService;
	}
	
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
