package jan.day15.package1;

public class B {
	
	A a1 = new A(true); // public은 다 가능
	A a2 = new A(1); // default는 같은 패키지는 가능
	//A a3 = new A("String");// private은 같은 패키지여도 안됨
	
}
