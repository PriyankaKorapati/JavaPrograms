package com.innerclass;

public class InnerClass {

	static class Student{
		int studentId=101;
		String studentName = "priya";
		class StudentInfo{
			void display(){
				System.out.println("Student Details");
				System.out.println("----------------");
				System.out.println("Student ID : "+studentId);
				System.out.println("Student Name : "+studentName);
			  }
		  }
	}
	
	static class Employee{
		static class Company{
			void display() {
				System.out.println("\nCompany Details");
				System.out.println("----------------");
				System.out.println("Company Name : ABC Technologies");
				System.out.println("Company Location : Hyderabad");
			}
		}
	}
	
	static class Bank{
		void displayAccount() {
			class Account{
				void display() {
					System.out.println("\nAccount Details");
					System.out.println("----------------");
					System.out.println("Account Number : 123456789");
					System.out.println("Account Holder : Rahul");
					System.out.println("Balance        : 50000");
				}
			}
			Account acc = new Account();
			acc.display();
		}
	}
	
	static class Mobile {
        String brand = "Samsung";
        String model = "S24";

        class Specifications {
            void display() {
                System.out.println("Specifications");
                System.out.println("--------------");
                System.out.println("RAM     : 12 GB");
                System.out.println("Storage : 256 GB");
            }
        }

        void displayMobile() {
            System.out.println("\nMobile Details");
            System.out.println("--------------");
            System.out.println("Brand   : " + brand);
            System.out.println("Model   : " + model);
            
            Specifications spec = new Specifications();
            spec.display();
        }
	}
        
        interface Greeting{
        		void displayMessage();
        }
        
        
	public static void main(String[] args) {
		
		Student s = new Student();
		Student.StudentInfo info= s.new StudentInfo();
		info.display();
		
		Employee.Company company = new Employee.Company();
		company.display();
		
		Bank bank = new Bank();
		bank.displayAccount();
		
		Mobile mobile = new Mobile();
		mobile.displayMobile();
		
		Greeting g = new Greeting() {

			@Override
			public void displayMessage() {
				System.out.println("\nWelcome to Java Inner Classes");
			}
			
		};
		g.displayMessage();
		
	}

}

