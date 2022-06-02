package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Oleg";
		
		String lastName="Smith";
		long phone=1234567890l;
		
		//xxx-xxx-xxxx
		String phoneNumber="123-456-7890";
		
		String address="123 Washington str";
		
	int age=30;
	String city="Miami";
	
		
		//shortcut for printing
		//syso +ctrl +space --> hit enter
		
		/* we can use + 
		 *  to attach String to String
		 * 
		 */
		
		System.out.println(name+" "+lastName);
		
		
		// Oleg in Miami
		
		System.out.println(name+" lives in "+city);
		
		
		
		//Oleg is 30 years old
		
		System.out.println(name+" is "+age+" years old");
		
		
		
	}

}
