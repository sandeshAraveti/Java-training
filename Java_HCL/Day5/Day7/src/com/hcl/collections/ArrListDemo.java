package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrListDemo {
	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("pooornesh");
		names.add("samitha");
		names.add("teja");
		names.add("priya");
		names.add("bharath");
		System.out.println("names are");
		for (Object object : names) {
			System.out.println(object);
		}
		names.add(2,"priyanka");
		System.out.println("names after adding item");
		for (Object object : names) {
			System.out.println(object);
			
			
		}
		names.add(3,"janapriya");
		System.out.println("names after adding item"); 
		for (Object object : names) {
			System.out.println(object);
			
		}
		names.remove("pooornesh");
		System.out.println("List after removing by object name");
		for (Object object : names) {
			System.out.println(object);
			
		}
		names.remove(0);
		System.out.println("List after removing");
	for (Object object : names) {
		
		
	}
		
		
		
		
	}

}
