package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection
					("jdbc:mysql://localhost:3307/sqlpractice","root","root");
			System.out.println("Connected..");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Agent");
			while(rs.next()){
				System.out.println("firstname "+rs.getString("FirstName"));
				System.out.println("lastname "+rs.getString("LastName"));
				System.out.println("gender "+rs.getString("Gender"));
				System.out.println("maritalstatus "+rs.getString("MaritalStatus"));
				
				System.out.println("----------");
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
