package com.hcl.day3;

public class TempDemo {
	public void temp(double c){
		double f=((9*c)/5)+32;
		System.out.println("faherenit value" + f);
	}
	public static void main(String[] args) {
	
	TempDemo obj = new TempDemo();
	obj.temp(21);
	}

}
