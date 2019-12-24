package com.hcl.collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Double> m=new Hashtable<String,Double>();
		m.put("Lakshmi", 54866.22);
		m.put("Preeti", 56789.76);
		m.put("Niharika", 67843.87);
		m.put("TejaSai", 75392.53);
		String key;
		double sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		key=sc.next();
		sal=m.getOrDefault(key, 0.0);
		System.out.println("Salary "+sal);
		
	}

}
