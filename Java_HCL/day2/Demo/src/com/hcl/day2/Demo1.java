package com.hcl.day2;

public class Demo1 {
	
	public void show(int x){
		System.out.println("Show w.r.t. Integer" +x);
	}
    public void show(double x){
	System.out.println("Show w.r.t. Double"  +x);
}
public void show(String x){
	System.out.println("Show w.r.t. String"  +x);
}
public void show(boolean x){
	System.out.println(("Show w.r.t. Boolean"  +x);

}
public static void main(String[] args) {
	Demo1 obj=new Demo1();
	obj.show(12);
	obj.show(12.56);
	obj.show("HCL");
	obj.show(true);
	
}
