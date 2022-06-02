package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter number of worked years");
		int num=scan.nextInt();
		
		if (num>=5) {System.out.println("You are eligible for the bonus");
		
		System.out.println("What is your annual salary");
		int salary=scan.nextInt();
		
		if(salary>50000) {System.out.println("Your bonus is 5000");}
		
		else {System.out.println("Your bonus is 3000");}
		}
		else {System.out.println("You are not eligible for the bonus");}
		
		
		
	}

}
