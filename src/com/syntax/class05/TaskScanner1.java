package com.syntax.class05;

import java.util.Scanner;

public class TaskScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		if(age>=18) {System.out.println("The driver license will be issued to you");}
		else {System.out.println("Please get a learners permit");}
	}

}
