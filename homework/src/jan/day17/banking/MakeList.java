package jan.day17.banking;

import java.util.ArrayList;

public class MakeList {
	private int idx = 0;
	private ArrayList<Account> accList = new ArrayList();
	
	public void signOn(Account acc) {
		accList.add(acc);
		
		System.out.println("회원 등록이 완료되었습니다");
		this.idx += 1;
		
	}
	
	public void printList() {
		System.out.println("회원출력");
		
		for (Account abc : accList) {
			System.out.println(abc);
		}
		
	}
}
