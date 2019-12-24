package com.hcl.anonymous;

public class ThrDemo {
	
	public static void main(String[] args) {
		Thread t2=new Thread(){
			@Override
			public void run() {
				for(int i=0;i<10;i+=2){
					System.out.println("odd "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
	};
		Thread t1=new Thread(){
			@Override
			public void run() {
				for(int i=0;i<10;i+=2){
					System.out.println("Even "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
				}
			}
		};
		t2.start();
		t1.start();
	}
}
		
	


