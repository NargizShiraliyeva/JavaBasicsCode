package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		
		int secretNum=15;
		int answer;
		do{
			
			System.out.println("Guess my secret number");
			answer=scan.nextInt();
			
		}
		while(answer!=15);
		
		System.out.println("You got it!");
		
	}
}
