package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		String country, favoriteFood;
		
		System.out.println("Please tell me where are you from?");
		country=scan.nextLine();
		
		switch(country.toLowerCase()) {
		
		case "mexico":
			favoriteFood="tacos";
			break;
		case "canada":
			favoriteFood="poutine";
			break;
		case"turkey":
			favoriteFood="Lahmacun";
			break;
		case "pakistan":
			favoriteFood="pati chai";
			break;
		case "egypt":
		   favoriteFood="koshary";
		   break;
		case"usa":
			favoriteFood="burgers";
			break;
			default:
				favoriteFood="unknown";
				
		
		}
		
		System.out.println("You are from "+country+" and your favorite food is "+favoriteFood);
		
	}

}
