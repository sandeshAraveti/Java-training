package com.hcl.day4;

public class Customer {
    int custId;
    String name;
    String city;
    double premium;
    public Customer(){
        custId = 6;
        name = "Nanditha";
        city = "nellore";
        premium = 84.75;
       
    }
    public Customer(int custId, String name, String city, double premium) {
        super();
        this.custId = custId;
        this.name = name;
        this.city = city;
        this.premium = premium;
    }
    @Override
    public String toString() {
        return "Customer [custId=" + custId + ", name=" + name + ", city="
                + city + ", premium=" + premium + "]";
    }
    public boolean equals(Object obj)
    {
       Customer res=(Customer)obj;
       if(res.city==city)
       {
            return false;
       }
         else
         {
        	 return true;
         }
        
    }
}















