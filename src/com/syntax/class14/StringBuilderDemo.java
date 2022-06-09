package com.syntax.class14;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s=new String("hahahaha");
		System.out.println(s.toUpperCase());
		StringBuilder st=new StringBuilder("jajajaja");
		System.out.println(st.reverse());
		
		//String and StringBuilder both are classes that we can use to store and manipulate characters
		//But String is imMutable and StringBuilder is mutable
		//when we make a lot of changes to a String it creates multiple copies inside your memory and
		//because of this reason because for every change a new variable is created
	}

}
