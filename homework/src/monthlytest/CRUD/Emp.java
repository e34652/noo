package monthlytest.CRUD;

public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private double sal;
	private String comm;
	private int deptno;
	
	
	public Emp(int empno, String ename, String job, int mgr, String hiredate, double sal, String comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	
	public int getEmpno() {
		return empno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getMgr() {
		return mgr;
	}
	
	public String getHiredate() {
		return hiredate;
	}
	
	public double getSal() {
		return sal;
	}
	
	public String getComm() {
		return comm;
	}
	
	public int getDeptno() {
		return deptno;
	}


	@Override
	public String toString() {
		return empno + "\t" + ename + "\t" + job + "\t" + mgr + "\t" + hiredate
				+ "\t" + sal + "\t" + comm + "\t" + deptno;
	}

	
	

}
