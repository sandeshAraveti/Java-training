package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo1 {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("sowmy");
		names.add("Teja");
		names.add("Sai");
		names.add("Navya");
		names.forEach(n-> {
			System.out.println(n);
			
		});
		List<Integer> num=new ArrayList<Integer>();
		num.add(new Integer(67));
		num.add(new Integer(87));
		num.add(new Integer(47));
		num.add(new Integer(57));
		num.add(new Integer(87));
		num.add(new Integer(27));
		num.forEach(p->{
			if(p>50){
				System.out.println(p);
			}
		});
		
	}

}
