package com.multhreadingTask;


class FirstThread extends Thread{
	public void run() {
		System.out.println("First thread message");
	}
}
class SecondThread extends Thread{
	public void run() {
		System.out.println("Second thread message");
	}
}
public class Ex3 {

	public static void main(String[] args) {
		FirstThread t1 = new FirstThread();
		SecondThread t2 = new SecondThread();
		t1.start();
		t2.start();
	}

}
