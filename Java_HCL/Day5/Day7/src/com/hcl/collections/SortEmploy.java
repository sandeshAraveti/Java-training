package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;



public class SortEmploy {
	
	public static void main(String[] args) {
		Comparator c=new NameComparator();
		SortedSet s=new TreeSet(c);
		s.add(new Employ(1,"niha",67549));
		s.add(new Employ(2,"hari",67549));
		s.add(new Employ(3,"harika",67549));
		s.add(new Employ(4,"navya",67549));
		s.add(new Employ(5,"nanditha",67549));
		for (Object object : s) {
			Employ e=(Employ)object;
			System.out.println(e);
		}
			
		}

}