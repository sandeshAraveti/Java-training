package com.hcl.cfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new
					FileInputStream("C:/Java_HCL/Day5/Day7/src/com/hcl/cfile/FInput.java");
			int ch;
			while((ch=fin.read())!=-1){
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
