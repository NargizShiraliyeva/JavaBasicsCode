package com.syntax.class11;

import java.util.Scanner;

public class Dog {
	

		String name;
		int age;
		double weight; // these sometimes called as properties, attributes, fields of the class
		String colour;
		double height;
		String breed;

		// how that object behave
		void bark() {
			System.out.println("Dog barks");
		}

		void walks() {
			System.out.println("Dog walks");
		}

		void eat() {
			System.out.println("Dogs eat bones");

		}
	public static void main(String[] args) {
		// new Dog() how we create an object
		
		//Scanner scanner=new Scanner(System.in); //ctrl + click
		//scanner.next(); //ctrl + click
		Dog jimmy= new Dog(); // creating an object and storing in a variable
		jimmy.name="Jimmy";
		jimmy.age=6;
		jimmy.weight=16;
		jimmy.colour="Pink";
		jimmy.height=2.6;
		jimmy.breed="German";
		jimmy.bark();
		
		
		
	}

}
