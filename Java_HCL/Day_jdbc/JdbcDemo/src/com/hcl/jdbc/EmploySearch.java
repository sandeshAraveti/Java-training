package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmploySearch {
	public static void main(String[] args) {
		int empno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ No");
		empno=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection
					("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			String cmd="Select  * from Employ where Empno=? ";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1, empno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("empno "+rs.getInt("Empno"));
				System.out.println("Name "+rs.getString("Name"));
				System.out.println("Department "+rs.getString("Dept"));
				System.out.println("desig "+rs.getString("desig"));
			}else{
				System.out.println("Record not found...");
			}
				
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
