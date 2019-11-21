package com.hcl.day3;

public class EvenorOdd {
  public void sum(int n) {
		if(n%2 == 0 ) {
			System.out.println("postive");
			}
		else{
      System.out.println("negative");
    }
  }
  public static void main(String[] args) {
		EvenorOdd obj = new EvenorOdd();
    obj.sum(2);
  }
}

