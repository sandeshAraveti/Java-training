package com.hcl.day3;

public class CaseDemo {
    public void show(String dayName){
        switch(dayName){
        case "Monday" :
            System.out.println("Its working day 1");
            break;
        case "Tuesday" :
            System.out.println("Its working day 2");
        case "Saturday" :
            System.out.println("Its saturday...");
        }
    }
    public static void main(String[] args) {
        String dayName="Monday";
        new CaseDemo().show(dayName);
    }

}
