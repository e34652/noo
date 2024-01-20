package jan.day19.b;

import java.util.ArrayList;
import java.util.List;
class MyClass{}
class Acc{
	MyClass mc;
	int x;
	String method() {
		return "문자열";
	}
}

public class VehicleEx {

	public static void main(String[] args) {
		new Bus().checkFare(); // 이 객체를 호출할 변수가 없어서 재활용이 불가능함, 차라리 static을 쓰지 
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		//vehicle.checkFare(); 업캐스팅 된 상태라 자식 클래스 고유의 데이터는 사용 불가능
		if (vehicle instanceof Bus) {
		System.out.println("가능");
		}

		Bus bus = (Bus) vehicle; // vehicle을 다운캐스팅한 데이터의 참조값을 bus에 저장  
		bus.checkFare();
		
	
	}

}


/*String str = "테스트";
String str1 = "";
for(int i = 0; i < 100; i++) { // 성능 고민 필요? << String buffer 사용 권장
	str1 += str;
	System.out.println(str1);
}


List<Acc> list = new ArrayList<>();  // <제네릭> 리스트 안에 들어갈 수 있는 타입을 제약, 그러나 제네릭을 생략하면 모든 타입이 들어갈 수 있음, 리스트는 제네릭이 하나만
//list.add(123); // 이렇게 사용하면 편해보이지만 각 인덱스에 어떤 타입이 들어갔는지를 다 알아야 하기 때문에 권장하지 않음
//list.add("문자열");
//list.add(3.14);
list.add(new Acc());
for(Object obj : list) { // obj는 모든 종류의 클래스 타입을 포함하므로 배열 안에 모든 타입이 들어갈 수 있음
	Acc acc = (Acc) obj; // 스트링은 객체 주소의 데이터를 그대로 문자열로 출력하므로 강제형변환으로 인한 손실은 거의 없다  
	System.out.println(acc);
}*/