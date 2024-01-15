package jan.day15;

public class SingletonEx {

	public static void main(String[] args) {
//		Singleton sing1 = new Singleton();
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		if (sing1 == sing2) {
			System.out.println("싱글턴은 항상 하나의 객체만 서비스된다");
		}
		
		if (sing1.equals(sing2)) {
			System.out.println("싱글턴은 항상 같은 객체가 서비스된다");
		}
	}

}
