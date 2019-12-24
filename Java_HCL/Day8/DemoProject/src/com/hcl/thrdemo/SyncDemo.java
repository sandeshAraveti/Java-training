package com.hcl.thrdemo;
class Demo{
	synchronized void dispMsg(String name){
		System.out.println("Hello "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("How are u...");
	}
}
class Sai extends Thread {
	Demo demo;
	Sai(Demo demo) {
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.dispMsg("Sai");
	}
}
class Teja extends Thread {
	Demo demo;
	Teja(Demo demo){
		this.demo=demo;
	}
	@Override
	public void run() {
		demo.dispMsg("Teja");
	}
		
	}
class Priya extends Thread {
	Demo demo;
	Priya(Demo demo){
		this.demo=demo;
		
	}
	@Override
	public void run() {
		demo.dispMsg("Priya"); 
	} 
	
}



public class SyncDemo {
	public static void main(String[] args) {
		Demo demo=new Demo();
		Sai sai=new Sai(demo);
		Teja teja=new Teja(demo);
		Priya priya=new Priya(demo);
		
		Thread t1=new Thread(sai);
		Thread t2=new Thread(teja);
		Thread t3=new Thread(priya);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	}
	


