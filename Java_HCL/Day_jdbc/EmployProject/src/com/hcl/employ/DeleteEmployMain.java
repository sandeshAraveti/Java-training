package com.hcl.employ;

import java.util.Scanner;

public class DeleteEmployMain {
	public static void main(String[] args) {
		int empno;
		System.out.println("Enter Employ No");
		Scanner sc=new Scanner(System.in);
		empno=sc.nextInt();
		EmployDAO dao=new EmployDAO();
		System.out.println(dao.deleteEmploy(empno));
	}

}
