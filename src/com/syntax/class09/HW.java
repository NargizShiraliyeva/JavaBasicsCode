package com.syntax.class09;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array
		
	
		
		String[] cars= {"Mercedes", "BWM", "Honda", "Nissan", "Subaru", "Lamborgini"};
		
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
			
		}
		
		
		for(String car:cars) {System.out.print(car+" ");}
	}

}
