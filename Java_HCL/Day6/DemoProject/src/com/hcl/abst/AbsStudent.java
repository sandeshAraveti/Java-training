package com.hcl.abst;

abstract class Student{
	int sno;
	String sname;
	double cgp;
	public Student(int sno, String sname, double cgp) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", cgp=" + cgp + "]";
	}
	
}
class Nandi extends Student{

	public Nandi(int sno, String sname, double cgp) {
		super(sno, sname, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
class Monica extends Student{

	public Monica(int sno, String sname, double cgp) {
		super(sno, sname, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
class Anu extends Student{

	public Anu(int sno, String sname, double cgp) {
		super(sno, sname, cgp);
		// TODO Auto-generated constructor stub
	}
	
}

public class AbsStudent {
	
		public static void main(String[] args) {
			Student nanditha=new Nandi(12,"Nanditha",45);
			Student monica=new Monica(13,"Monica",55);
			Student anu=new Anu(14,"Anu",42);
		 Student[] arrStudent=
			 {
					 nandi,
					 monica,
					 anu
					 
			 };
		 
		 for(Student student: arrStudent) {
			 System.out.println(student);
			
		}
			
		}
	}
	
	


