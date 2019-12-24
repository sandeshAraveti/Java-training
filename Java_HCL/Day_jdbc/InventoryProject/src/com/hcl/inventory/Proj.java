package com.hcl.inventory;

import java.sql.Connection;

public class Proj {
	public static void main(String[] args) {
		Connection con=DaoConnection.getConnection();
		System.out.println("Connected");
		InventoryDAO dao=new InventoryDAO();
		System.out.println(dao.generateStockId());
	}

}
