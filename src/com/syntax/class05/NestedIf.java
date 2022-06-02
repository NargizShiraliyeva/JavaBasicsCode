package com.syntax.class05;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=33;
		int num2=16;
		int num3=8;
		
		if(num1>num2 && num1>num3) {
			System.out.println("The largest number is "+num1);
		}else if (num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}else {
			System.out.println("The largest number is "+num3);
		}
	}

}
