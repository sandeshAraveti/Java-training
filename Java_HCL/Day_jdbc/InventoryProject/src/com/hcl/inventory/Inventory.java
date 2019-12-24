package com.hcl.inventory;

public class Inventory {
	private String stockid;
	private String ItemName;
	private int Price;
	private double QuantityAvail;
	private int  OrderId;
	private String StockID;
	private int QtyOrd;
	private double billAmt;
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public double getQuantityAvail() {
		return QuantityAvail;
	}
	public void setQuantityAvail(double quantityAvail) {
		QuantityAvail = quantityAvail;
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getStockID() {
		return StockID;
	}
	public void setStockID(String stockID) {
		StockID = stockID;
	}
	public int getQtyOrd() {
		return QtyOrd;
	}
	public void setQtyOrd(int qtyOrd) {
		QtyOrd = qtyOrd;
	}
	public double getBillAmt() {
		return billAmt;
	}
	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}
}
	
	