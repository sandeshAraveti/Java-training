package com.hcl.project;

import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentDAO {
	
	static List<Student> LstStudent = null;
	static ResourceBundle rb=null;
	static{
		LstStudent=new ArrayList<Student>();
		rb=ResourceBundle.getBundle("student");
	}
	public String addStudentDao(Student student){
		LstStudent.add(student);
		return rb.getString("add");
}
	public List<Student> showStudentDao(){
		return LstStudent;
	}
	public Student searchStudentDao(int sno){
		Student objStudent=null;
		for (Student student : LstStudent) {
			if(student.getSno()==sno){
				objStudent=student;
			}
		}
		return objStudent;
	}
	public String deleteStudentDao(int sno){
		String result="";
		Student student = searchStudentDao(sno);
		if(student!=null){
			LstStudent.remove(student);
			result= rb.getString("delete");
		}else{
			result=rb.getString("not found");
		
		}
		
		return result;
	}
	public String updateStudentDao(Student objStudent){
		Student student=searchStudentDao(objStudent.getSno());
		String result="";
		if(student!=null){
			for (Student s : LstStudent) {
				if(s.getSno()==objStudent.getSno()){
					s.setName(objStudent.getName());
					s.setCity(objStudent.getCity());
					s.setCgpa(objStudent.getCgpa());
				}
			}
		result= rb.getString("upd");
		}else{
			result= rb.getString("not found");
			
		}
		
		return result;
	}
}
	