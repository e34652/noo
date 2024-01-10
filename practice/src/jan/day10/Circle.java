package jan.day10;

public class Circle{
	int radius;
	String name;
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public Circle(){
		
	}
	
	public Circle(int radius){
		this(radius, "원");
	}
	
	public Circle(int radius, String name) {
		super();
		this.radius = radius;
		this.name = name;
	}


	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(); // pizza = new Circle(10,"자바피자");
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은" + area);
		
		//이것의 캡슐화? get set
		//new 연산자로 클래스를 복제할 때 static이 붙은 애들은 어떻게 되는가
		//static이 없는 애들의 복제품이 생성자에 의해 복제된 후 메모리를 할당받는다
	}
}
