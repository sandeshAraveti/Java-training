package com.hcl.cfile;

import java.io.DataInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx1 {
	public static void main(String[] args) {
		FileInputStream fin;
		try {
			
			FileInputStream fin1 = new FileInputStream("c:/files/d1.txt");
			DataInputStream din=new DataInputStream(fin1);
			int a=din.readInt();
			int b=din.readInt();
			int c=a+b;
			System.out.println("sum is "+c);
			c=a-b;
			System.out.println("sub is "+c);
			c=a*b;
			System.out.println("mul is "+c);
			
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
