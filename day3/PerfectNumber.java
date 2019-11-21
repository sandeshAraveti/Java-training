package com.hcl.day3;

import java.util.Scanner;

public class PerfectNumber {
	public void show(){
		int n ,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer");
		n=sc.nextInt();
		for(int i=1;i<n;i++){
			if( n%i == 0){
				sum = sum+i;
				
			}
		}
	
	if(sum==n){
		System.out.println("perfect");}
	else{
		System.out.println("not perfect");
	}
	}
	public static void main(String[] args) {
	
		
		new PerfectNumber().show();
	}
}


