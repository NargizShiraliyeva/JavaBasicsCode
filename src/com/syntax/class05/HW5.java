package com.syntax.class05;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("What is your birth month?");
		String month = scan.nextLine();

		if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("The season you were born is Spring");
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("The season you were born is Summer");
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			System.out.println("The season you were born is Autumn");
		} else if (month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("The season you were born is Winter");
		}

	}

}
