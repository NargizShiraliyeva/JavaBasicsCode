package com.syntax.class14;

public class MethodsDemo {

	//What is Method:  Method is a block of code a group of java statements that are grouped together and
	//Why: we can execute those statements by just creating an object of the class that contains 
	//How:  that method and by writing the objects name .method name

		
		void printHello() {
			
			System.out.println("How are you guys?");
			
			
		}
		
		boolean returnTrue (){
			return true;
		}
		int returnInt() {
			return 10;
		}
		//Methods that return something and Methods that don't return something
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			MethodsDemo md=new MethodsDemo(); // md is an object of the class
			md.printHello();
			
			boolean xs=md.returnTrue();
			int num=md.returnInt();
			System.out.println(num);
	}

}
