package com.hcl.project;
import java.io.*;
import java.util.*;

public class StudentDAO {

	static List<Student> lststudent=null;
	static ResourceBundle rb=null;
	static{
		lststudent=new ArrayList<Student>();
		rb=ResourceBundle.getBundle("student");
	}
	
	//method to add the students 
	public String addStudentDao(Student student){
		lststudent.add(student);
		return rb.getString("add");
	}
	
	
	//method to show the students list
    public List<Student> showStudentDao()
    {
	   return lststudent;
    }
    
    //method to search students list
    public Student searchStudentDao(int sno)
    {
    	Student objstudent=null;
    	for (Student student : lststudent) {
			if(student.getSno()==sno){
				objstudent=student;
			}
		}
    	return objstudent;
    }
    
    //method to delete the student record
    public String deleteStudentDao(int sno){
    	String result="";
    	Student student= searchStudentDao(sno);
    	if(student!=null)
    	{
    		lststudent.remove(student);
    		result=rb.getString("delete");
    	}else{
    		result=rb.getString("notfound");
    		
    	}
    	return result;
    }
    
    //method to update the student record 
    public String updateStudentDao(Student objstudent)
    {
    	Student student = searchStudentDao(objstudent.getSno());
    	String result="";
    	if(student!=null){
    		for (Student s : lststudent) {
				if(s.getSno()==objstudent.getSno()){
					s.setName(objstudent.getName());
					s.setCity(objstudent.getCity());
					s.setCgp(objstudent.getCgp());
				}
			}
    		result=rb.getString("upd");
    	}else{
    		result=rb.getString("notfound");
    	}
    	return result;
    }
    public void writeStudentFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/student.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lststudent);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readStudentFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/student.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lststudent =(List<Student>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}



