package com.syntax.class05;

import java.util.Scanner;

public class TaskScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		boolean boo=scan.nextBoolean();
		
		
		
		if (boo) {System.out.println("What is the balance on your card?");
		
		int value=scan.nextInt();
		if(value>1000) {System.out.println("Pay off immediately");}
		else {System.out.println("Spend more");}
		}else {System.out.println("We can offer a card");}
		
		}
	}


