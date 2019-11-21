package com.hcl.project;


	import java.util.*;

	public class CustomerMain {


		public static void main(String[] args) {
			int choice;
			Scanner sc = new Scanner(System.in);
			do{
				System.out.println("options");
				System.out.println("--------");
				
				System.out.println("1.Add customers");
				System.out.println("2.Show customers");
				System.out.println("3.Search customers");
				System.out.println("4.update customers");
				System.out.println("5.delete customers");
				
			
				System.out.println("6. Write Student File");
				System.out.println("7. Read Student File");
				System.out.println("8.Exit");
				System.out.println("Enter the choice  ");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					addCustomer();
					break;
				case 2:
					showCustomer();
					break;
				case 3:
					searchCustomer(choice);
					break;
				case 4:
					updateCustomer();
					break;
				case 5:
				    deleteCustomer();
				    break;
				case 6 : 
					writeCustomerFile();
					break;
				case 7 : 
					readCustomerFile();
					break;
				case 8 : 
					return;
				default : 
					System.out.println("Invalid Choice");
						
				}
			}while(choice!=8);
		}
		
		public static void writeCustomerFile() {
			new CustomerBal().writeCustomerFileBal();
		}
		
		public static void readCustomerFile() {
			new CustomerBal().readCustomerFileBal();
		}

		public static void updateCustomer()
		{
			Customer objcustomer = new Customer();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the customer no.");
			objcustomer.setCustId(Integer.parseInt(sc.nextLine()));
			System.out.println("enter customer name");
			objcustomer.setCustName(sc.nextLine());
			System.out.println("enter customer annual premium");
			objcustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("enter modal premium");
			objcustomer.setModelPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("enter the payment mode");
			objcustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
			CustomerBal obj=new CustomerBal();
			System.out.println(obj.updateCustomerBal(objcustomer));
		}
		public static void deleteCustomer()
		{
			int cusid;
			System.out.println("enter the cusid");
			Scanner sc = new Scanner(System.in);
			cusid=sc.nextInt();
			CustomerBal obj=new CustomerBal();
			System.out.println(obj.deleteCustomerBal(cusid));
			
		}
		
		
		public static void searchCustomer(int custid)
		{
			int custid1;
			System.out.println("enter customer id");
			Scanner sc=new Scanner(System.in);
			custid1=sc.nextInt();
			CustomerBal obj = new CustomerBal();
			Customer customer=obj.searchCustomerBal(custid1);
			if(customer==null){
				System.out.println("customer record not found...");
			}else{
				System.out.println(customer);
			}
			
		}
		
		public static void showCustomer()
		{
			CustomerBal obj=new CustomerBal();
			List<Customer> customers=obj.showCustomerBal();
			for (Customer customer : customers) {
				System.out.println(customer);
			}
		}

		public static void addCustomer(){
			Customer objcustomer = new Customer();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the customer no.");
			objcustomer.setCustId(Integer.parseInt(sc.nextLine()));
			System.out.println("enter customer name");
			objcustomer.setCustName(sc.nextLine());
			System.out.println("enter customer annual premium");
			objcustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("enter modal premium");
			objcustomer.setModelPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("enter the payment mode");
			objcustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
			CustomerBal obj=new CustomerBal();
			try {
				boolean res=obj.addCustomerBal(objcustomer);
				if(res==true){
					System.out.println("customer added successfully...");
				}
			} catch (CustomerException e) {
			System.out.println(e.getMessage());
			}
			
			
		}
	}


