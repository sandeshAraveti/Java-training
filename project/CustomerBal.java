package com.hcl.project;
import java.util.List;

public class CustomerBal {
	

	
		static StringBuilder sb=new StringBuilder();
		public void writeCustomerFileBal() {
			new CustomerDAO().writeCustomerFileDao();
		}
		
		public void readCustomerFileBal() {
			new CustomerDAO().readCustomerFileDao();
		}
		public boolean addCustomerBal(Customer objCustomer) throws CustomerException{
			boolean isAdded=true;
			if (objCustomer.getCustId() <= 0) {
				sb.append("studentno cannot be negative or zero \r\n");
				isAdded=false;
				
			}
			if(objCustomer.getCustName().length() <=5 ){
				sb.append("name more than 3 characters \r\n");
				isAdded=false;
			}
			if(objCustomer.getAnnualPremium()>=20000 && objCustomer.getAnnualPremium()>100000 ){
				sb.append("annual premium between 2000 and 10000");
				isAdded=false;
		}
			if(objCustomer.getModelPremium()<1000 && objCustomer.getModelPremium()>50000 ){
				sb.append("modal premium is between 1000 and 50000");
				isAdded=false;

	    }
			if(objCustomer.getPaymentMode()>4){
				sb.append("payment mode 1 0r 2 3 \r\n");
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
		public Customer searchCustomerBal(int custid ){
			return new CustomerDAO().searchCustomerDao(custid);
		}
		public String updateCustomerBal(Customer objCustomer){
			return new CustomerDAO().updateCustomerDao(objCustomer);

		}
		public String deleteCustomerBal(int CustID){
			return new CustomerDAO().deleteCustomerDao(CustID);
			
		}}
 
