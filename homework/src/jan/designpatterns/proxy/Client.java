package jan.designpatterns.proxy;

public class Client {

	public static void main(String[] args) {
		// ISubject sub1 = new RealSubject();
		// sub1.action();
		// 위와 아래가 같다
		ISubject sub = new Proxy(new RealSubject());
		sub.action();
	}
}
