package com.hcl.day3;

public class CaseDemo {
  public void show(String dayname){
    switch(dayname) {
      case "monday" :
        System.out.println("working day1");
		break;
	  case "tuesday" :
		System.out.println("working day2");
	  case "sunday" :
		System.out.println("holiday");
    }
  }
  public static void main(String[] args) {
    String dayname = "sunday";
	new CaseDemo().show(dayname);
  }
}
