package com.hcl.employ;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    
    	Connection con=DaoConnection.getConnection();
    	String cmd="select * from Employ";
    	
    	try {
    		PreparedStatement pst=con.prepareStatement(cmd);
    		ResultSet rs=pst.executeQuery();
    		while(rs.next()){
    			System.out.println("Employ No "+rs.getInt("Empno"));
    			System.out.println("Name "+rs.getString("Name"));
    			System.out.println("Department "+rs.getString("Dept"));
    			System.out.println("Designation "+rs.getString("Desig"));
    			System.out.println("Salary "+rs.getInt("Basic"));
    		}
    	} catch (SQLException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    	}
    	
}  	
    	
    	
    	


