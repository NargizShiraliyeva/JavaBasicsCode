package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Batch 13 is Great";
		System.out.println(str.startsWith("Batch")); //true
		System.out.println(str.endsWith("Great")); //true
		System.out.println(str.toLowerCase().endsWith("great"));
		
		String name="HAMID";
		System.out.println(name.toLowerCase());
		System.out.println(name);
		
		System.out.println(str.contains("is"));
		System.out.println(str.toLowerCase().contains("batch"));
	}

}
