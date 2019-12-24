package com.hcl.project;

import java.util.List;

public class CustomerBAL {
	static StringBuilder sb=new StringBuilder();

	public boolean addCustomerBal(Customer objCustomer) throws CustomerException{
		boolean isAdded=true;
		if(objCustomer.getCustId()<=0){
			sb.append("Customer cannot be negative or zero\r\n");
			isAdded=false;
		}
		if(objCustomer.getCustName().length()<=3){
			sb.append("custNAme more than 3 characters\r\n");
			isAdded=false;
		}
		if(objCustomer.getAnnualPremium()<=2000 && objCustomer.getAnnualPremium()>=10000){
			sb.append("Annualpremium should be in 2000 and 10000 \r\n");
			isAdded=false;
			
		}
		if(objCustomer.getModalPremium()<=1000 && objCustomer.getModalPremium()>=50000){
			sb.append("Modal premium should be in 1000 to 50000  \r\n");
			isAdded=false;
			
		}
		if(objCustomer.getPaymentMode()<=1 && objCustomer.getPaymentMode()>=3){
			sb.append("Payment mode should be 1 2 3");
			isAdded=false;
		}
		if(isAdded==false){
			throw new CustomerException(sb.toString());
			
		}else{
			new CustomerDAO().addCustomerDao(objCustomer);
		}
		return isAdded;
	}
	public List<Customer> showCustomerBal(){
		return new CustomerDAO().showCustomerDao();
	}
	public Customer searchCustomerBal(int custId){
		return new CustomerDAO().searchCustomerDao(custId);
		
	}
	public String updateCustomerBAl(Customer objCustomer){
		return new CustomerDAO().updateCustomertDao(objCustomer);
	}
	public String deleteCustomerBal(int custId){
		return new CustomerDAO().deleteCustomerDao(custId);
	}
	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomertFileDao();
	}
	
	public void readStudentFileBal() {
		new CustomerDAO().readCustomerFileDao();

}
}	

