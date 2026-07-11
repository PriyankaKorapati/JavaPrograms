package com.multhreadingTask;


class ShowThreadName extends Thread{
	public void run() {
		System.out.println("Thread Name: "+Thread.currentThread().getName());
	}
}
public class Ex5 {

	public static void main(String[] args) {
		
		ShowThreadName t = new ShowThreadName();
		t.setName("MyCustomThread");
		t.start();
	}

}
