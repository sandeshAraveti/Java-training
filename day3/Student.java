package com.hcl.day3;

public class Student {

	
	int sno;
	String name;
	double cgp;
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", cgp=" + cgp + "]";
	}
	public void show(){
		Student s1 = new Student();
		s1.sno=1;
		s1.name="sai";
		s1.cgp=5.6;
		Student s2 = new Student();
		s2.sno=2;
		s2.name="sanni";
		s2.cgp=8.6;
		Student s3 = new Student();
		s3.sno=1;
		s3.name="sai";
		s3.cgp=5.6;
		Student students[] = {s1,s2,s3};
		for (Student student : students) {
			System.out.println(student);
		}
	}
	public static void main(String[] args) {
		
		new Student().show();
	}

}
