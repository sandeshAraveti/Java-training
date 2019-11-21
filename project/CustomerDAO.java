package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	
	static List<Customer> LstCustomer = null;
	static{
		LstCustomer=new ArrayList<Customer>();
	}
	public String addCustomerDao(Customer customer){
		LstCustomer.add(customer);
		return "customer created Sucessfully";
}
	public List<Customer> showCustomerDao(){
		return LstCustomer;
	}
	public Customer searchCustomerDao(int sno){
		Customer objCustomer=null;
		for (Customer customer : LstCustomer) { 
			if(customer.getCustId()==sno){
				objCustomer=customer;
			}
		} 
		return objCustomer;
	}
	public String deleteCustomerDao(int sno){
		String result="";
		Customer customer = searchCustomerDao(sno);
		if(customer!=null){
			LstCustomer.remove(customer);
			result="Customer Record deleted succesfully";
		}else{
			result="customer record not found";
		}
		return result;
	}
	public String updateCustomerDao(Customer objCustomer){
		Customer customer=searchCustomerDao(objCustomer.getCustId());
		String result="";
		if(customer!=null){
			for (Customer s : LstCustomer) {
				if(s.getCustId()==objCustomer.getCustId()){
					s.setCustName(objCustomer.getCustName());
					s.setAnnualPremium(objCustomer.getAnnualPremium());
					s.setModelPremium(objCustomer.getModelPremium());
					s.setPaymentMode(objCustomer.getPaymentMode());
				}
			}
			result="customer record updated";
		}else{
			result="customer record not found";
		}
		return result;
		
	}

public void writeCustomerFileDao() {
	try {
		FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		Object listCustomer = null;
		objout.writeObject(listCustomer);
		objout.close();
		fout.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void readCustomerFileDao() {
	try {
		FileInputStream fin=new FileInputStream("c:/files/customer.txt");
		ObjectInputStream objin=new ObjectInputStream(fin);
		List<Customer> listCustomer = (List<Customer>)objin.readObject();
		objin.close();
		fin.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

}