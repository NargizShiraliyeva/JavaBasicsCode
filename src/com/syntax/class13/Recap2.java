package com.syntax.class13;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Where is Sameer?";
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("e"));
		
		System.out.println(str.indexOf("e",5)); //starting from 6th index and gives the first e onwards 
		
		System.out.println("---------------------");
		
		int counter=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				counter++;
				if(counter==4) {
			
				System.out.print(i);
				}
			}
		
		/*for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='e') {
				System.out.print(i+" ");
			}
		}*/
	}

}
}
