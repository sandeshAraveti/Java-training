package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
	
	public static void main(String[] args) {
		List employ=new ArrayList(); 
		employ.add(new Employ(1,"niha",67549));
		employ.add(new Employ(2,"hari",67549));
		employ.add(new Employ(3,"harika",67549));
		employ.add(new Employ(4,"navya",67549));
		employ.add(new Employ(5,"nanditha",67549));
		for (Object object : employ) {
			Employ e=(Employ)object;
			System.out.println(e);
			
		}
		
			
		}
		
			
	}


