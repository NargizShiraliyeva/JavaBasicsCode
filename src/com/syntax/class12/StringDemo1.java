package com.syntax.class12;

public class StringDemo1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name= new String("Nargiz"); // this is a proper way of creating an object from a class
		String name2="Nargiz"; // it is same as String name= new String("Oleg");
		//All the classes in java can be treated as a datatype
		
		// if a class is present insie the same package or if a class belongs to java.lan package
	
		
		System.out.println(name.length());
		
		name2="Nigar "; //spaces are also counted
		System.out.println(name.length());
		
		String captain="NAVEED";
		
		System.out.println(captain.toLowerCase());
		captain=" I love Java";
		System.out.println(captain.toUpperCase());
	}

}
