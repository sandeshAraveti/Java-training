package com.hcl.day3;
public class Sbvalid {
	public StringBuilder show(String firstname,String lastname,String city,double cgp){
		StringBuilder sb=new StringBuilder();
		if(firstname.length() < 5){
			sb.append("invalid firstname");
		}
			if(lastname.length() < 5){
				sb.append("invalid firstname");}
			if(city.length() < 5){
				sb.append("\ninvalid city");
			}
				if(cgp>10){
					sb.append("\ninvalid cgp");
				}
				return sb;
			}
	   public static void main(String[] args){
		   String firstname = "ram" ,lastname="kishan",city="goa";
		   double cgp=12.5;
		   System.out.println(new Sbvalid().show(firstname,lastname,city,cgp));
	   }
					
		
	}


