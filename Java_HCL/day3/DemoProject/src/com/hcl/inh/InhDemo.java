package com.hcl.inh;

public class InhDemo {
public static void main(String[] args) {
	//First obj=new Second();
   //Second obj=new First(); 
	// obj.show();
 //   obj.display();
    
    
    Second s=(Second)new First();
    s.show();
    s.display();
  }
}


