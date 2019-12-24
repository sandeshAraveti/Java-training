package com.hcl.jdk8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmploySorted {
	public static void main(String[] args) {
		List<Employ> emp=new ArrayList<Employ>();

		
		emp.add(new Employ(1,"gayi","it","swe",45000));
		emp.add(new Employ(2,"laxmi","ece","swe",46980));
		emp.add(new Employ(3,"Teja","css","swe",65400));
		emp.add(new Employ(4,"anusha","it","swe",24700));
		Collections.sort(emp,(p1,p2)->{
			return p1.dept.compareTo(p2.dept);
			
		});
		emp.forEach(p->{
			System.out.println(p);
		});
		
		
		emp.stream().filter(p -> p.basic>=45000).forEach(x -> {
			System.out.println(x);
		});
		emp.stream().filter(p->p.dept=="it").forEach(x-> {
			System.out.println(x);
		});
		System.out.println("max salary of employee\n...");
		Employ maxEmploy=emp.stream().max((p1,p2)
				->p1.basic >=p2.basic 
				?1:-1).get();
		System.out.println(maxEmploy);
				
		

	}
	}
