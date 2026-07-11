package com.synchronizedTask;

public class Ex3 {
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Hello");
			}
		};
		Thread t2 = new Thread(()->{
			System.out.println("World");
		});
		t1.start();
		t1.join();
		t2.start();
	}

}
