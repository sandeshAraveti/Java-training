package com.hcl.sup;

public class p35 {

	static int x=12;
	public static int show(){
		return x--;
	}
	public static void main(String[] args) {
		show();
		System.out.println(x);
	}
}
