package com.hcl.jdk8;

import java.util.Date;
import java.util.List;

public class Employ {
	int empno;
	String name;
	String dept;
	String design;
	double basic;
	public Employ(int empno, String name, String dept, String design, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.dept = dept;
		this.design = design;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", dept=" + dept + ", design=" + design + ", basic="
				+ basic + "]";
	}
	public int getEmpId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getAnnualPremium() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getCustName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPaymentMode() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmpId(int parseInt) {
		// TODO Auto-generated method stub
		


		
	}


}
