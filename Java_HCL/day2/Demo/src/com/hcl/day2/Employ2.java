
package com.hcl.day2;

public class Employ2 {

	int empno;
	String name;
	double basic;
	public Employ2(){
		empno=5;
		name="Nandi";
		basic=88523;
	}
	public Employ2(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
		
	}
	@Override
	public String toString() {
		return "Employ2 [empno=" + empno + ", name=" + name + ", basic="
				+ basic + "]";
	}
	
}

