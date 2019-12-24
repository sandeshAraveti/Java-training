package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AgentSearch {
	public static void main(String[] args) {
		int AgentID;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AgentId");
		AgentID=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection
					("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			String cmd="Select  * from Agent where AgentId=? ";
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,AgentID);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				System.out.println("AgentID "+rs.getInt("AgentID"));
				System.out.println("fistname "+rs.getString("FirstName"));
				System.out.println("lastname "+rs.getString("LastName"));
				System.out.println("gender "+rs.getString("Gender"));
				System.out.println("maritalstatus "+rs.getString("MaritalStatus"));
				
			}
			else{
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
