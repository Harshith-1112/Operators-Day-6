package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//even or odd
		// leap year or not leap year
		// number is positive or not
		// number is divisible by 5 or not
		// code play
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age ");
		int age=scanner.nextInt();
		//syntax (condition)?exp1:exp2;
		String result=(age>18)?"Eligible to vote ":"not eligible to vote";
		System.out.println(result);
		scanner.close();
		
		/*8) Ternary or conditional operator(?):
		 

		int i,k;
		i=10;
		k=i<0?-i:i;
		System.out.println("absolute value of " +i+ "is"+k);
		i= -10;
		k=i<0?-i:i;
		System.out.println("absolute value of " +i+ "is"+k);   */
		
		
		/* 7) Assignment operators:
		System.out.println((10<2)&&true);
		System.out.println(10|2);
		System.out.println(10^2);  */
		
		
		/* 5) Bitwise operators:
		  AND,OR,E-OR
		System.out.println(10&2);
		System.out.println(10|2);
		System.out.println(10^2);  */

		
		/*4) Relational operators:
         <,>,<=,>=,==,!=   */

		
		/*3.Increment and decrement operators:
		int x=10;
		int y=x++;
		//System.out.println(x);
		System.out.println(y);
		System.out.println(x);*/
		
		
		
		/*2.String concatenation operator(+):
		int a=10,b=20,c=30;
		String d="codegnan";
		System.out.println(a+b+c+d);
		System.out.println(b+c+d+a);
		System.out.println(c+d+a+b);
		System.out.println(d+a+b+c);*/
		
		/*1.Arithmetic operators
		System.out.println(0.0/0);*/

	}

}
