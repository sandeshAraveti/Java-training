package com.hcl.day2;

public class Student
{
int sno;
String firstName;
String lastNmae;
double cgp;
public String lastName;
@Override
public boolean equals(Object obj) {
         Student student=(Student)obj;
         if(student.cgp==cgp)
         {
        return true;
         }
         else
         {
        return false;
         }


@Override
public String toString()
{
return "Student [sno=" + sno + ", firstName=" + firstName + ", lastNmae=" + lastNmae + ", cgp=" + cgp + "]";

}
















