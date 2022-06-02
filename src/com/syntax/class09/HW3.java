package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array to store double values and then print all elements using 2 different loops 
		
		double[] num= {5.12, 6.50, 5.40, 8.90 };
		
		for(int i=0; i<num.length; i++) {System.out.println(num[i]);}
		
		//another loop
		
		for(double nums:num) {System.out.print(nums+" ");}
	}

}
