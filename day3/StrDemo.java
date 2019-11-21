package com.hcl.day3;

public class StrDemo {
   public void show(){
	String msg = "welcome to hcl";
	System.out.println("length" + msg.length());
	System.out.println("first occurence of a is" + msg.indexOf('a'));
	System.out.println("last occurance of a is" + msg.lastIndexOf('a'));
	System.out.println("first occurance of z is" + msg.indexOf('z') );
	System.out.println("char at 5th postion " + msg.charAt(5));
	System.out.println(" lowercase " + msg.toLowerCase());
	System.out.println(" uppercase " + msg.toUpperCase());
	System.out.println("substring" + msg.substring(1,7));
	System.out.println("starts with" + msg.startsWith("welcome"));
	System.out.println("concatmsg" + msg.concat("omr"));
	System.out.println("replacedstring" + msg.replace("java","j2EE"));
   }
public static void main(String[] args) {
	new StrDemo().show();
}

}
