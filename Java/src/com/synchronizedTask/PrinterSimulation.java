package com.synchronizedTask;

class Printer {
	int paperCount;
	Printer(int paperCount){
		this.paperCount=paperCount;
	}
	public synchronized void printDocument(String document,Printer printer, String userName) {
		if(paperCount>0) {
			System.out.println(userName+" is printing "+document);
			paperCount--;
			System.out.println("papers left: "+paperCount);
		}else {
			System.out.println(userName +" cannot printing "+document +"(no papers)");
		}
	}
}
class User extends Thread{
	String name;
	Printer printer;
	String document;
	User(String name,Printer printer,String document){
		this.name=name;
		this. printer= printer;
		this.document=document;
	}
		public void run() {
			printer.printDocument(document, printer, name);
		}
}
public class PrinterSimulation {

	public static void main(String[] args) {
		Printer printer = new Printer(3);
		User u1 = new User("user1",printer,"doc1");
		User u2 = new User("user2",printer,"doc2");
		User u3 = new User("user3",printer,"doc3");
		User u4 = new User("user4",printer,"doc4");
		u1.start();
		u2.start();
		u3.start();
		u4.start();
	}

}
