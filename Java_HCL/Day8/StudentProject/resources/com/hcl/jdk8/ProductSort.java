package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductSort {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<Product>();
		
		list.add(new Product(1,"smsung a5",17000));
		list.add(new Product(2,"iphone",100000));
		list.add(new Product(3,"redmi",543300));
		list.add(new Product(4,"motto g6",24000));
		list.add(new Product(5,"Nokia lumia",42000));
		list.add(new Product(6,"lenovo vibe",12210));
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
			
		});
		list.forEach(p->{
			System.out.println(p);
		});
		int sum=list.stream().reduce(Product());
		
		
		
		System.out.println("hutidsuhiuhiuhrisdh");
		Collections.sort(list,(p1,p2)->{
			if(p1.price>=p2.price){
				return 1;
		}else
		{
			return -1;
		}
				
		});
		
		
		list.forEach(p1->{
			System.out.println(p1);
		});
	}

	}

