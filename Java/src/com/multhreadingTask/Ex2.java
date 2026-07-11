package com.multhreadingTask;


class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 1; i <=3; i++) {
			System.out.println("Runnable thread is running");
		}
	}
}
public class Ex2 {

	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.start();

	}
}
