package com.hcl.day3;

public class EvenOdd {
	public void check(int n){
		if(n%2==0){
			System.out.println("Even no...");
		}else{
			System.out.println("Odd no.....");
		}
	}
	public static void main(String[] args) {
		int n=4;
		EvenOdd obj=new EvenOdd();
		obj.check(n);
	}
}
