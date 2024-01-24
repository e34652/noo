package jan.day24.jdbc;

class Dept{ // 클래스명은 테이블과 똑같이 줌 
	private int deptno;
	private String dname;
	private String loc;
	
	Dept(int deptno, String dname, String loc){
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
		
		
	}

	public int getDeptno() {
		return deptno;
	}

	public String getDname() {
		return dname;
	}

	public String getLoc() {
		return loc;
	}

	@Override
	public String toString() {
		return deptno + "\t| " + dname + "  \t|" + loc +"\n";
	}

}
