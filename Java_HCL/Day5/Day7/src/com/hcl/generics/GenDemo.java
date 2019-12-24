package com.hcl.generics;

class Data<T>{
	public void swap(T a,T b){
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value " +a+ "B value " +b);
	}
}
public class GenDemo {
	public static void main(String[] args) {
		Data obj1=new Data();
		int a=4,b=7;
		obj1.swap(a, b);
		double a1=12.5,b1=5.7;
		obj1.swap(a1, b1);
		String s1="Bharath", s2="Gayi";
		obj1.swap(a1, b1);
		
	}
	

}
 