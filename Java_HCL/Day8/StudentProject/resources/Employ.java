
public class Employ implements Comparable {
	int empno;
	String name;
	String dept;
	String desig;
	double salary;
	public Employ(int empno, String name, String dept, String desig, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", salary="
				+ salary + "]";
	}
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Object o) {
		
	
		return 0;
	}
	public void setEmpId(int parseInt) {
		// TODO Auto-generated method stub
		
	}
	public void setEmpDepartment(String nextLine) {
		// TODO Auto-generated method stub
		
	}
	public void setEmpEmail(String nextLine) {
		// TODO Auto-generated method stub
		
	}
	

}
