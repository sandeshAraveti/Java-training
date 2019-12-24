package com.hcl.cfile;

import java.util.ArrayList;
import java.util.List;

public class GenIntEx {
	public static void main(String[] args) {
		List<Integer> num=new ArrayList<Integer>();
		num.add(new Integer(46));
		num.add(new Integer(56));
		num.add(new Integer(78));
		num.add(new Integer(90));
		num.add(new Integer(65));
		int sum=0;
		for (Integer integer : num) {
			sum+=integer;
		}
		System.out.println("sum is "+sum);
	}

}
