package com.syntax.class05;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("What is your quiz score?");
		int quiz=scan.nextInt();
		System.out.println("What is your mid term score?");
		int mid=scan.nextInt();
		System.out.println("What is your final score?");
		int finalScore=scan.nextInt();
		
		int averageScore=(quiz+mid+finalScore)/3;
		
		if(averageScore>=90) {System.out.println("Your grade is A");}
		else if (averageScore>=70 && averageScore<90) {System.out.println("Your grade is B");}
		else if (averageScore>=50 && averageScore<70) {System.out.println("Your grade is C");}
		else if (averageScore<50) {System.out.println("Your grade is F");}
		
		



		 
		 
		 
		 
	}

}
