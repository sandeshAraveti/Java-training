package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	 public static void main(String[] args) {
		File src=new
		File("C:/Java_HCL/Day6/DemoProject/src/com/hcl/ex/Custom.java");
		File tar=new File("C:/files/cpy.java");
		
	try{	
		FileReader fr=new FileReader(src);
		FileWriter fw=new FileWriter(tar);
		int ch;
		while((ch=fr.read())!= -1){
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
		System.out.println("***File Copied***");
		
	}catch(FileNotFoundException e){
		e.printStackTrace();
		
	}catch(IOException e)
	{
		e.printStackTrace();
	}
}
}