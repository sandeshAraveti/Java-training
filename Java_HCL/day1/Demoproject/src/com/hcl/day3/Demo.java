package com.hcl.day3;

class Data {
	public void sayHello(){
		System.out.println("Hi We are from HCL");
	}
	private void lunch(){
		System.out.println("No Lunch today...");
	}
	void logoff(){
	    System.out.println("Logot by 7:30...");
	}
}
public class Demo {
	public static void main(String[] args) {
		Data obj =new Data();
		obj.sayHello();
		obj.logoff();
	}

}
