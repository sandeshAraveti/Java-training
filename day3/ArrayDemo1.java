package com.hcl.day3;

public class ArrayDemo1 {
	public void show(){
    int[] a = new int[] {12,6,33,321,45};
	for(int i=0;i<a.length;i++) {
      System.out.println(a[i]);
    }
  }
  public static void main(String[] args) {
    new ArrayDemo1().show();
  }

}
