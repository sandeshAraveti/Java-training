package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {
	public static void main(String[] args) {
		File f1=new
				File("C:/Java_HCL/Day6/DemoProject/src/com/hcl/ex/Custom.java");
		try {
			FileReader fr=new FileReader(f1);
			int ch;
			while((ch=fr.read())!= -1){
			System.out.print((char)ch);	
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
