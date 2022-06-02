package com.syntax.class05;

import java.util.Scanner;

public class TaskAndOr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please write your height in inch");
		int height=scan.nextInt();
		
		
		if (height<60) {System.out.println("short");}
		else if (height>60 && height<72) {System.out.println("medium");}
		else if(height>72) {System.out.println("tall");}
		
	}

}
