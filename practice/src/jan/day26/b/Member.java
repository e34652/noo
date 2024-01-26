package jan.day26.b;

public class Member {

	public String id;

	public Member(String id) {// 물리적으로 다른 객체이지만 같은 객체인 것처럼 만듦
		this.id = id;
	}
	
	

	@Override
	public String toString() {
		return "Member 객체 [" + id + "]";
	}



	@Override
	public boolean equals(Object obj) {//equals는 원래 주소값을 비교하는 메서드임 (==와 같음)
		if (obj instanceof Member) {// 따라서 내용을 비교하고 싶다면 아래와 같이 재정의를 하는 과정이 필요함
			Member member = (Member) obj;
			
			if (id.equalsIgnoreCase(member.id)) {
				return true;
			}
			
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.toLowerCase().hashCode();  
	}
	
}
