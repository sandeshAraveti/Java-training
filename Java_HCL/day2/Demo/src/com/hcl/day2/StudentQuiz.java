package com.hcl.day2;

public class QuizStudent
{
public static void main(String[] args) {
 Student s1=new Student();
 Student s2=new Student();
 System.out.println(s1==s2);
 s1.sno=1;
 s1.firstName="monica";
 s1.lastName="preethi";
 s1.cgp=2.2;
 s2.sno=2;
 s2.firstName="monica";
 s2.lastName="preethi";
 s2.cgp=2.2;
System.out.println(s1.equals(s2));
}

}

