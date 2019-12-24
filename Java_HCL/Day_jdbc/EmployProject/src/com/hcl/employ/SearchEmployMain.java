package com.hcl.employ;

import java.util.Scanner;

public class SearchEmployMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ No  ");
		empno=sc.nextInt();
		EmployDAO dao=new EmployDAO();
		Employ employ=dao.searchEmploy(empno);
		if(employ!=null){
			System.out.println("Name  "+employ.getName());
			System.out.println("Department "+employ.getDept());
			
		}else{
			System.out.println("Record Not Found...");
		}
	}

}
