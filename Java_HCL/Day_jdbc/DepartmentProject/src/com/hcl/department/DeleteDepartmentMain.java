package com.hcl.department;

import java.util.Scanner;



public class DeleteDepartmentMain {
	public static void main(String[] args) {
		int deptno;
		System.out.println("Enter Department No");
		Scanner sc=new Scanner(System.in);
		deptno=sc.nextInt();
		DepartmentDAO dao=new DepartmentDAO();
		System.out.println(dao.deleteDepartment(deptno));
	}

}
