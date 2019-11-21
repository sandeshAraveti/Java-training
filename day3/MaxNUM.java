package com.hcl.day3;

import java.nio.charset.MalformedInputException;

public class MaxNUM {
	public void max(int num1,int num2,int num3){
//		int num1= 2;
//		int num2=3;
//		int num3=5;
		if(num1>=num2 && num1>=num3){
			System.out.println("num1 is max" + num1);}
		
			else if(num2>=num1 && num2>=num3){
				System.out.println("num2 is max" + num2);
				
			}
		else if(num3>=num1 && num3>=num2){
			System.out.println("num 3 is max" + num3);
			
				
			}
		
		}
			public static void main(String[] args) {
				MaxNUM obj =new MaxNUM();
				obj.max(11,23,53);
			}
	}



