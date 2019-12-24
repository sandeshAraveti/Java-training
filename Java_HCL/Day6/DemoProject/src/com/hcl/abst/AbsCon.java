package com.hcl.abst;

abstract class Employ{
	int empno;
	String name;
	double salary;
	public Employ(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
class Nanditha extends Employ{

	public Nanditha(int empno, String name, double salary) {
		super(empno, name, salary);
		// TODO Auto-generated constructor stub
	}
	
}
class Sai extends Employ{

	public Sai(int empno, String name, double salary) {
		super(empno, name, salary);
		// TODO Auto-generated constructor stub
	}
	
}
public class AbsCon {
	public static void main(String[] args) {
		Employ[] arrEmploy=
			{
					new Nanditha(1,"Nanditha",83846),
					new Sai(2,"Sai",45125)
			};
		for (Employ employ : arrEmploy) {
			System.out.println(employ);
		}
	}

}
