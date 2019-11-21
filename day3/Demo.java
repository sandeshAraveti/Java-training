package com.hcl.day3;
class data{
	public void sayHello(){
		System.out.println("hi hcl");
	}
	private void lunch(){
		System.out.println("no lunch");
	}
	void logoff(){
		System.out.println("lougout");
	}
	}


public class Demo {
	public static void main(String[] args) {
		data obj = new data();
		obj.sayHello();
		obj.logoff();
	}

}
