package com.hcl.day2;

public class BoxStudent {
	public void show (Object ob){
	    String type=ob.getClass().getSimpleName();
	    if(type.equals("Student")){
			Student s=(Student)ob;
			System.out.println(s);
		}
		}
		public static void main(String[] args) {
	    Student s1=new Student();		
		s1.sno=12;
		s1.firstName="Nandu";
		s1.lastName="sai";
		s1.cgp=13;
		new BoxStudent().show(s1);
		
		}
		
}

