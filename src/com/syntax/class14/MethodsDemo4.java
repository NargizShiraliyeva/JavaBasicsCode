package com.syntax.class14;

public class MethodsDemo4 {

	
	boolean isEven(String name) {
		if(name.length()%2==0) {
			return true;
		}else {return false;}
	}
	
	int sumNum(int num1, int num2) {
		return num1+num2;
	}
	
	void printManyTimes(String str, int times) {
		
		for(int i=0; i<times; i++) {
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodsDemo4 md=new MethodsDemo4();
		System.out.println(md.isEven("Nargiz"));
		
		
		System.out.println(md.sumNum(10, 10));
		
		md.printManyTimes("Java", 3);
	}

}
