package jan.day23.jdbc;

public class Data {
private int empno;
private String ename;
private String job; 
private int mgr;
private String hireDate;
private int sal;
private double comm; 
private int deptno;

public Data(int empno, String ename, String job, int mgr, String hireDate,int sal, double comm, int deptno) {
	super();
	this.empno = empno;
	this.ename = ename;
	this.job = job;
	this.mgr = mgr;
	this.hireDate = hireDate;
	this.sal = sal;
	this.comm = comm;
	this.deptno = deptno;
}

public Data() {
	super();
}

public void setEmpno(int empno) {
	this.empno = empno;
}

public void setEname(String ename) {
	this.ename = ename;
}

public void setJob(String job) {
	this.job = job;
}

public void setMgr(int mgr) {
	this.mgr = mgr;
}

public void setHireDate(String hireDate) {
	this.hireDate = hireDate;
}

public void setSal(int sal) {
	this.sal = sal;
}

public void setComm(double comm) {
	this.comm = comm;
}

public void setDeptno(int deptno) {
	this.deptno = deptno;
}

@Override
public String toString() {
	return empno + "\t" + ename + "\t" + job + "\t" + mgr + "\t" + hireDate
			+ "\t" + sal + "\t" + comm + "\t" + deptno;
}

	


}
