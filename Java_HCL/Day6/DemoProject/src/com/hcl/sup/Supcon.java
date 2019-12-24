package com.hcl.sup;

class First {
	int sno;
	String name;
	public First(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "First [sno=" + sno + ", name=" + name + "]";
	}
	
		
}
class Second extends First{

	public Second(int sno, String name) {
		super(sno, name);
		// TODO Auto-generated constructor stub
	}
	
}

public class Supcon {
public static void main(String[] args) {
	First obj=new Second(1, "nanditha");
	System.out.println(obj);
	
}
	
}
