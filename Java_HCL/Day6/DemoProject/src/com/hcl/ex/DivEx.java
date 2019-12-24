package com.hcl.ex;

public class DivEx {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division  "  +c);
			
		}catch(NumberFormatException e){
			System.out.println("String cannot be conveted as Integer");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Args are not passed");
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
		System.out.println("Division by Zero impossible");
		}catch(Exception e){
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Program by HCL batch");
		}
	}
}
