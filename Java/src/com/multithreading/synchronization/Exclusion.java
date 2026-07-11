package com.multithreading.synchronization;

class Printer{
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

class User1 implements Runnable{
	Printer printer;
	public User1(Printer printer) {
		this.printer =printer;
	}
	@Override
	public void run() {
		synchronized(printer) {
			Printer.print(5,"priya");
		}
		
	}
}

class User2 implements Runnable{
	Printer printer;
	public User2(Printer printer) {
		this.printer=printer;
	}
	public void run() {
		synchronized(printer) {
			Printer.print(5, "ishu");
		}
	}
}
public class Exclusion {

	public static void main(String[] args) {
		Printer p = new Printer();
		
		User1 u1= new User1(p);
		User2 u2= new User2(p);
		Thread t1= new Thread(u1);
		Thread t2= new Thread(u2);
		t1.start();
		t2.start();

	}

}
