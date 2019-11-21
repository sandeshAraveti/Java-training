package com.hcl.day3;

public class FactorialDemo {
  public void fact(int n) {
		int i=1,fact=1;
		while(i<=n){
			fact=fact*i;
			i++;
		}
		System.out.println("factorial number is" + fact);
		
	}
	public static void main(String[] args) {
		int n=5;
		new FactorialDemo().fact(n);
	}
	

}
