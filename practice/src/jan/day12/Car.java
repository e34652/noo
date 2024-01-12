package jan.day12;

public class Car { // 아래의 모든 메서드는 필드 gas의 값을 다룬다
	//필드
	int gas;
	
	//생성자
	
	//메소드 << 접근제한자, static 생략 가능
	void setGas(int gas) { //리턴값이 없는 메소드로 매개값을 받아 필드값을 변경 << 리턴값이 있는 메소드는 리턴을 해야하므로 필드값만 변경할 수 없음
		this.gas = gas; // << gas 값 초기화
	}

	boolean isLeftGas() {//리턴값이 boolean인 메소드로 gas 필드값에 따라 true false 리턴
		if(gas == 0) { // << gas가 있는지 없는지
			System.out.println("gas가 없습니다.");
			return false; // false 리턴 << gas 없음
		}//else << 더 직관적이지만 검증을 한번 더 하게됨 
		System.out.println("gas가 있습니다"); // 
		return true; // true 리턴 << gas 있음
	}
	void run() { // 잔여 가스가 다 떨어질 때까지 달림
		while(true) { // 가스가 다 떨어지기 전에 가스를 채우라고 하는 응용 
			if(gas > 0) {
				System.out.println("달립니다(gas잔량:" + gas +")");
				gas -=1; // 달릴 때마다 gas -1 
			}else {
				System.out.println("멈춥니다(gas잔량:" + gas + ")");
				return; // 메소드 실행 종료 << 가스 모두 소진, void 메소드이므로 break;와 같은 효과 
			}//return; 은 그 자리에서 끝, break; 는 반복문의 중괄호 끝으로 가서 끝
		}
	}
}
