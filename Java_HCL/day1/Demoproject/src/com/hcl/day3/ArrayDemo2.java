package com.hcl.day3;

public class ArrayDemo2
/**
 *
 */{
  public void show(){
    String[] names={"Sneha","Kamakshi","Sai","Teja","Laxmi"};
    for (String string : names){
        System.out.println(string);
    }
}
public static void main(String[] args) {
    new ArrayDemo2().show();
}
}