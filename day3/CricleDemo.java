package com.hcl.day3;
/**
 * program for cal circle.
 * @author BLTuser
 *
 */
public class CricleDemo {
	public void cal(double radius){
		double area,circ;
		area=Math.PI * Math.pow(radius,2);
		circ=2*Math.PI*radius;
		System.out.println("area of circle" + area);
		System.out.println("circumference " + circ);
	}
	public static void main(String[] args) {
		double radius = 12.5;
		CricleDemo obj = new CricleDemo();
  obj.cal(12.5);
		
	}

}
