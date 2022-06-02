package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 100;
		num = num + 100;

		System.out.println(num);// 200

		num = num + 50;
		System.out.println(num);// 250

		num += 100; // num=num+100

		System.out.println(num);

		num -= 10; // num=num-10
		System.out.println(num);// 340

		num /= 10;
		num *= 2;

		System.out.println(num);

		num %= 2;
		System.out.println(num);

		System.out.println("_________________________________________");

		int num1 = 120;

		num1 += 500;
		num1 += 200;

		System.out.println(num1);

		int num2 = 310;

		num2 -= 60;

		System.out.println(num2);

		int cakePiece = 11;
		cakePiece /= 4;

		System.out.println(cakePiece);

		int cake = 25;
		cake %= 7;

		System.out.println(cake);

	}

}
