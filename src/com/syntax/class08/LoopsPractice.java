package com.syntax.class08;

public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum=0;
		
		for(int i=1; i<=70; i++) {
			if (i%2==0)
			
			sum+=i;
			
			
		}
		
		System.out.println("The sum of all even ="+sum );
		
		
		int sum1=0;
		
		for (int i=1; i<=70; i++) {
			if(i%2 !=0) {
			sum1+= i;
			
			}
		
		
			
		}
		
		System.out.println("The sum of all odds ="+sum1 );
		
		
		//another way
		int sumEven=0;
		int sumOdd=0;

		for (int i = 1; i <= 70; i++) {

		if (i % 2 == 0) {
		sumEven+=i;
		}else {
		sumOdd+=i;
		}
		}

		System.out.println("Sum even numbers is " +sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);
		
	
	}

}
