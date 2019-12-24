package com.hcl.project;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("-------");
			System.out.println("1.Add student");
			System.out.println("2.Show student");
			System.out.println("3.Search student");
			System.out.println("4.Update student");
			System.out.println("5.Delete student");
			System.out.println("6.Exit");
			System.out.println("Enter Your Chioce");
			choice=sc.nextInt();
			switch(choice){
			case 1:
				addStudent();
				break;
			case 2:
				showStudent();
				break;
			case 3:
				searchStudent();
				break;
			case 4:
				updateStudent();
				break;
			case 5:
				deleteStudent();
				break;
			case 6:
				return;
				default:
					System.out.println("Invalid Input");
			}
		
		}while(choice!=6);
	
}
	public static void updateStudent(){
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student No");
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter Student Name");
		objStudent.setName(sc.nextLine());
		System.out.println("Enter student city");
		objStudent.setCity(sc.nextLine());
		System.out.println("enter cgp");
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		StudentBAL obj=new StudentBAL();
		System.out.println(obj.updateStudentBAl(objStudent));
		
		
	} 
	
	
	public static void deleteStudent(){
		int sno;
		System.out.println("Enter Student NO");
		Scanner sc=new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL();
		System.out.println(obj.deleteStudentBal(sno));
	}
	
	public static void searchStudent(){
		int sno;
		System.out.println("Enter Student No");
		Scanner sc= new Scanner(System.in);
		sno=sc.nextInt();
		StudentBAL obj=new StudentBAL();
		Student student=obj.searchStudentBal(sno);
		if(student==null){
			System.out.println("Student record not found...");
		}else{
			System.out.println(student);
		}
		
	}
	public static void showStudent(){
		StudentBAL obj =new StudentBAL();
		List<Student> students=obj.showStudentBal();
		for (Student student : students) {
			System.out.println(student);
			
			
		}
		
	}
	
	
     public static void addStudent(){
		Student objStudent=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enterstudent sno");
		objStudent.setSno(Integer.parseInt(sc.nextLine()));
		System.out.println("Enterstudent name");
		objStudent.setName(sc.nextLine());
		System.out.println("Enter city");
		objStudent.setCity(sc.nextLine());
		System.out.println("enter cgp");
		objStudent.setCgp(Double.parseDouble(sc.nextLine()));
		StudentBAL obj=new StudentBAL();
			try {
				boolean res=obj.addStudentBal(objStudent) != null;
				if(res==true){
					System.out.println("Student added Successfully");
				}
			} catch (StudentException e) {
				System.out.println(e.getMessage());
				
			
			}
     }

}
