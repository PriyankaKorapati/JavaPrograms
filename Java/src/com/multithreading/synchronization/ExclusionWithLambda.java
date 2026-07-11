package com.multithreading.synchronization;


class Printer1{
	public static void print(int n,String name) {
		
		for(int i=1;i<=n;i++) {
			System.out.println(name +"-"+i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
	}
}
public class ExclusionWithLambda {

	public static void main(String[] args) {
		Printer1 p=new Printer1();
		Runnable user1=()->{
			synchronized(p) {
				Printer.print(5, "priya");
			}
		};
		
		Runnable user2=()->{
			synchronized(p) {
				Printer.print(5, "ishu");
			}
		};
		Thread t1=new Thread(user1);
		Thread t2=new Thread(user2);
		
		t1.start();
		t2.start();
	}

}
