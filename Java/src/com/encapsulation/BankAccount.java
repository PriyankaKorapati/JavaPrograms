package com.encapsulation;

// BankAccount class
class BankAccount {
    // Encapsulation (private variables)
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized Constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit Successful!");
            System.out.println("Updated Balance: " + balance);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
    }
    
    
    // Withdrawal Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
            System.out.println("Remaining Balance: " + balance);
        }
    }
}
