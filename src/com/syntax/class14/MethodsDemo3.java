package com.syntax.class14;

public class MethodsDemo3 {
  
	
	//Write a method that takes an int value if that value is even this method returns true otherwise it returns false
	
	
	boolean isEven(int num) {
		
		if (num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodsDemo3 md=new MethodsDemo3();
		
	System.out.println(md.isEven(9));
	}

}
