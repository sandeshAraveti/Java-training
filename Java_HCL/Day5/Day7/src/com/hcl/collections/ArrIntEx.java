package com.hcl.collections;


import java.util.*;

public class ArrIntEx {
	public static void main(String[] args) {
		List num=new ArrayList();
		num.add(new Integer(56));
		num.add(new Integer(67));
		num.add(new Integer(78));
		num.add(new Integer(87));
		int sum=0;
	
		for (Object object : num) {
			sum+=(Integer)object;
		}
			System.out.println("sum is"+sum);
			
		}
	
	}
	
	
	


