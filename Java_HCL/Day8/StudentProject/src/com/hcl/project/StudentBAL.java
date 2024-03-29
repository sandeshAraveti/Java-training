package com.hcl.project;

import java.util.List;

public class StudentBAL {
	
	static StringBuilder sb=new StringBuilder();
	public String addStudentBal(Student objStudent) throws StudentException{
		String isAdded=true;
		if(objStudent.getSno()<=0){
			sb.append("Student cannot be negative or zero\r\n");
			isAdded=false;
		}
		if(objStudent.getName().length()<=3){
			sb.append("NAme more than 3 characters\r\n");
			isAdded=false;
		}
		if(objStudent.getCity().length()<=3){
			sb.append("City more than 3 characters\r\n");
			isAdded=false;
			
		}
		if(objStudent.getCgp()<0){
			sb.append("cgp Non-negative \r\n");
			isAdded=false;
		}
		if(isAdded==false){
			throw new StudentException(sb.toString());
			
		}else{
			new StudentDAO().addStudentDao(objStudent);
		}
		return isAdded;
	}
	public List<Student> showStudentBal(){
		return new StudentDAO().showStudentDao();
	}
	public Student searchStudentBal(int sno){
		return new StudentDAO().searchStudentDao(sno);
		
	}
	public String updateStudentBAl(Student objStudent){
		return new StudentDAO().updateStudentDao(objStudent);
	}
	public String deleteStudentBal(int sno){
		return new StudentDAO().deleteStudentDao(sno);
	}

}
