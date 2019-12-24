package com.hcl.employ;

import java.util.List;

public class CreateAccountMain {
	
	public static void main(String[]args){
		EmployDAO dao=new EmployDAO();
		List<Employ> employList=dao.showEmploy();
		for (Employ employ : employList) {
			System.out.println("Employ No "+employ.getEmpno());
			System.out.println("Employ Name "+employ.getName());
			System.out.println("Department "+employ.getDept());
			System.out.println("Designation "+employ.getDesig());
			System.out.println("Salary "+employ.getBasic());
			System.out.println("---------------");
			
		}
	}

}
