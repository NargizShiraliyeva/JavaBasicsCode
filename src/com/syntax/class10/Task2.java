package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array to store char values and then print those in reverse order
		
		char[] letter= {'A', 'B', 'C', 'D', 'E'};
		for(int i=4; i<letter.length; i--) {
		if(i==-1)
		break;
		System.out.println(letter[i]);
		}
	}

}
