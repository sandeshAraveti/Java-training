package com.hcl.day2;

public class Employ {

	int empno;
	String name;
	double basic;
	@Override
	public boolean equals(Object obj) {
		Employ employ=(Employ)obj;
		if(employ.basic==basic){
			return true;
		}else{
		return false;
		}
	}
	
		
	
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic
				+ "]";
	}
	
	
}
