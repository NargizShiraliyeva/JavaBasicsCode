package com.syntax.class12;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//this can be on an interview

		String str = "Sameer is funny Sameer is gulbadan and he is sheer badan";
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(5));

		/*
		 * for(int i=0; i<str.length(); i++) {
		 * 
		 * System.out.print(str.charAt(i));
		 */

		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('s' == str.charAt(i) || 'S' == str.charAt(i)) {
				counter++;
			}

		}
		System.out.println("S appeared " + counter + " in the string");
	}

}
