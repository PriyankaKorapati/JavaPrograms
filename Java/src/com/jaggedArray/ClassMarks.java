package com.jaggedArray;

import java.util.Scanner;

public class ClassMarks {

	public static void main(String[] args) { 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of classes: ");
		int n=sc.nextInt();
		int[][] marks=new int[n][];
		for (int i = 0; i < n; i++) {
			System.out.println("enter no of students in class" +(i+1)+ ": ");
			int  cols=sc.nextInt();
			marks[i]=new int[cols];
			
			System.out.println("enter marks: ");
			for (int j = 0; j < cols; j++) {
				marks[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("Class "+(i+1)+" scored marks-->");
			for (int j = 0; j < marks[i].length; j++) {

				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
