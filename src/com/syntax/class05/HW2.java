package com.syntax.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Create a Java program that will ask user to input city and temperature.
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a city");
		String city=scan.nextLine();
		System.out.println("Please enter the temperature in Fahrenheit");
		int temp=scan.nextInt();
		
		System.out.println("The temperature in the city "+city+" is "+((temp-32)*5/9));
		
		
	}

}
