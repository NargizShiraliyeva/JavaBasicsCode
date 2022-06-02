package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //From an array of integer elements find the largest number
		
		int[] num= {4, 10, 33 };
		
		if (num[0]>num[1] && num[0]>num[2]) {System.out.println(num[0]+" is the largest number");}
		else if(num[1]>num[0] && num[1]>num[2]) {System.out.println(num[1]+" is the largest number");}
		else if(num[2]>num[0] && num[2]>num[1]) {System.out.println(num[2]+" is the largest number");}
	}

}
