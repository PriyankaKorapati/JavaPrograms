package com.encapsulation;

public class ATM {
	
	private int pin;
	public void setPin(int pin) {
		if(pin>=1000 && pin<=9999) {
			this.pin=pin;
		}else {
			System.out.println("invalid pin");
		}
		
	}
	
	public int getPin() {
		return pin;
	}
	

	public static void main(String[] args) {
		ATM a=new ATM();
		a.setPin(1234);
//		System.out.println(a.pin);
		System.out.println("pin:" +a.getPin());
	}

}
