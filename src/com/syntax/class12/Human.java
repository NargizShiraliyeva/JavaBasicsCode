package com.syntax.class12;

public class Human {
	
		
		String name;  // atributes/properties/fields(fields is used in java)
		int age;
		double weight;
		char gender;
		
		//methods/ functions/ behaviours (behaviours is used in java)
		void walk() {
			System.out.println("I can walk");
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Human nargiz= new Human();
		nargiz.name="Nara";
		nargiz.age=31;
		nargiz.weight=57;
		nargiz.gender='F';
		nargiz.walk();
	}

}


/*Rules:
 * We can define the fields and methods anywhere in the class.
 * The sequence only matters when we are inside a method.
 * 
 */







