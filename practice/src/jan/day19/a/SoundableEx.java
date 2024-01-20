package jan.day19.a;

public class SoundableEx {
	
	
	
	
	static class Cat implements Soundable{

		@Override
		public String sound() {
			
			return "야옹";
		}
		
	}
	
	static class Dog implements Soundable{

		@Override
		public String sound() {
			// TODO Auto-generated method stub
			return "멍멍";
		}
		
	}
	
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {

		printSound(new Cat());
		printSound(new Dog());
	}

}
