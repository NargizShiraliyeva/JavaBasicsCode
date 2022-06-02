package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner scan=new Scanner(System.in);
  
  System.out.println("What is the amount of loan?");
  double amount=scan.nextDouble();
  
  if (amount<=200.000) {System.out.println("Money will be lent");}
  else {System.out.println("The client is rejected");}

	}

}
