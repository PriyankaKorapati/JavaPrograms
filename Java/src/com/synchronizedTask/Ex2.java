package com.synchronizedTask;


class NumberPrinter implements Runnable{
	private int start;
	private int end;
	NumberPrinter(int start,int end) {
		this.start=start;
		this.end=end;
	}
	
	@Override
	public void run() {
		for (int i = start; i <=end; i++) {
			if(start%2==0 && i%2==0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			else if(start%2!=0 && i%2!=0) {
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
		
	}
	
}
public class Ex2 {

	public static void main(String[] args) throws Exception{
		Thread evenThread = new Thread(new NumberPrinter(2,20),"even numbers");
		Thread oddThread = new Thread(new NumberPrinter(1,19),"odd numbers");
		
		evenThread.start();
		evenThread.join();
		oddThread.start();
	}

}
