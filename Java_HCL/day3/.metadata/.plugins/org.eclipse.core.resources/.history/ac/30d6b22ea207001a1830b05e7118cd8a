package com.hcl.day4;

public class LMSMain {
    public static void main(String[] args) {
        Employee employ1=new Employee(1,"harika","manager",50000);
        Employee employ2=new Employee(2,"gayathri","team leader",30000);
        Employee employ3=new Employee(3,"nanditha","team leader",30000);
        Employee employ4=new Employee(4,"anusha","team leader",30000);
        Employee[] arr={employ1,employ2,employ3,employ4};
        new Employee().assignLeave(arr);
       
       
        for (Employee employ : arr) {
            System.out.println(employ);
        }
        LeaveHistory l1 = new LeaveHistory(2, 2, LeaveType.EL);
        new LeaveHistory().applyLeave(arr, l1);
        System.out.println(l1);
     
       
    }

}