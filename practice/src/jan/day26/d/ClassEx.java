package jan.day26.d;

class Car {
}

public class ClassEx {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		클래스 정보를 불러오는 방법 1
		Class clazz = Car.class; // bin 폴더에 있는 Car.class 파일을 불러씀, 
		
		String str = clazz.getResource("photo1.jpg").getPath(); // clazz의 클래스 파일 정보를 불러왔기 때문에 경로가 해당 폴더부터 시작  
		System.out.println(str);
		String str2 = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(str2);
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackageName());
		System.out.println("------------------------------");
//		클래스 정보를 불러오는 방법 2
		Class clazz2 = Class.forName("jan.day26.d.Car"); // 
		System.out.println(str);
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
		System.out.println("------------------------------");
//		클래스 정보를 불러오는 방법 2
		Car car = new Car();

		System.out.println(str);
		System.out.println(clazz2.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz2.getPackageName());
		
	}

}
