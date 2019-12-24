package com.hcl.day2;

public class Demo3 {
	public int sum(){
		return 5;
	}
public int sum(int x){
	return x+5;
}
public int sum(int x,int y){
	return x+y;
}
public static void main(String[] args) {
	Demo3 obj=new Demo3();
	System.out.println(obj.sum());
	System.out.println(obj.sum(7));
	System.out.println(obj.sum(12,5));
}
}

