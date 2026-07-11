package com.multhreadingTask;


class MyThread extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hello from MyThread");
		}
	}
}
public class Ex1 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();

	}

}
