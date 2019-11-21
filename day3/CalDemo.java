package com.hcl.day3;

public class CalDemo {
  public void sum(int a,int b) {
    int c = a + b;
    System.out.println("sum is " + c);
  }
  public static void main(String[] args) {
	int a,b ;
    a = Integer.parseInt(args[0]);
	b = Integer.parseInt(args[0]);
	CalDemo obj = new CalDemo();
    obj.sum(a, b);
  }
}
