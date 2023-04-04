package kr.or.kosa;

//한건의 데이터를 담을 수 있는 클래스
//데이터베이스의 테이블과 1:1 매핑 하는 클래스 
//create table emp( empno number , ename varchar2(30)); >> 1건의 
//select * from emp where empno=7902
//DTO , VO ,DOMAIN
public class Emp {
	private int empno;
	private String ename;
	private String job;
	public Emp(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	//public Emp(){}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	
}