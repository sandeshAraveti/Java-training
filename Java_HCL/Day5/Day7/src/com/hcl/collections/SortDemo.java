package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {
	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add("Niharika");
		s.add("Gayathri");
		s.add("Moni");
		s.add("Anusha");
		for (Object object : s) {
			System.out.println(object);
			
		}
		
	}

}
