package com.syntax.class11;

public class HWSwap2program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// write a program to swap 2 numbers without a temporary variable?
		
		int a=10;
		int b=20;
		
		a=a+b; //10+20=>30
		b=a-b; //30-20=>10
		a=a-b; //30-10=>20
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
