package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
		
		String[] animals= {"Monkey", "Donkey", "Lion", "Puma", "Rabbit"};
		
		for(int i=0; i<animals.length; i++) {System.out.println(animals[i]);}
		
		for(String animal:animals) {System.out.print(animal+" ");}
	}

}
