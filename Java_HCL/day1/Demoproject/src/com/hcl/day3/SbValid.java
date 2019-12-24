package com.hcl.day3;

public class SbValid {
public StringBuilder show(String firstName,String lastName,String city,double cgp){
    StringBuilder sb=new StringBuilder();
    if(firstName.length()<5){
        sb.append("Invalid FirstName....");
    }
    if(lastName.length()<5){
        sb.append("\nInvalid LastName.....");
    }
    if(city.length()<5){
        sb.append("\nInvalid city.......");
    }
    if(cgp>10){
        sb.append("\nInvalid CGP");
     }
    return sb;
}
public static void main(String[] args) {
    String firstName="Ram",lastName="Kishan",city="goa";
    double cgp=12.5;
    System.out.println(new SbValid().show(firstName, lastName, city, cgp));
}
}
