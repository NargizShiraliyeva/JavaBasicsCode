package com.syntax.class10;

public class New2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] [] usa= {
				
				{"New York", "Albany", "Buffalo" },
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond","Leesburg"}
		};
		
		System.out.println(usa[1][2]);
		System.out.println("I want to go to "+usa[2][0]);
		
		System.out.println("Total number of 1D arrays in usa = "+usa.length);
		
		//how many elements inside my first array
		
		int elemArray=usa[1].length; //change index to see each array
		System.out.println("Numbers of elements in 1 array ="+ elemArray);
		
		
		//outer loop iterates over rows
		// inner loop iterates over columns
		for(int row=0; row<usa.length; row++) {
			for(int col=0; col<usa[row].length; col++) {
				
				System.out.print(usa[row][col]+" ");
			}
			System.out.println();
		}
	}

}
