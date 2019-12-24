package com.hcl.ex;

public class ThrEx {
	
	public void check(int n){
		boolean flag=true;
		if(n<0){
			flag=false;
			throw new ArithmeticException("Negative Nos Not Allowed");
		}
		if(n==0){
			flag=false;
			throw new NumberFormatException("Zero is Invalid");
		}
		if(flag=true){
			System.out.println("N value " +n);
		}
	}

	public static void main(String[] args) {
		int n=5;
		try {
			new ThrEx().check(n);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}catch(Exception e)
		{	
			e.printStackTrace();
		}
		
	}
}
