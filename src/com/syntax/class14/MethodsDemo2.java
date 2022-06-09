package com.syntax.class14;

public class MethodsDemo2 {

	void printBatch() {
		for(int i=0; i<6; i++) {
		
		System.out.println("Batch 13 is great");
	}
	}
	
	void printManyTimes(int times) {
		for(int i=0; i<times; i++) {
		
		System.out.println("Tara is great");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		MethodsDemo2 md=new MethodsDemo2(); //Creating an object of the class
		md.printBatch();
		
		md.printManyTimes(3);
	}

}
