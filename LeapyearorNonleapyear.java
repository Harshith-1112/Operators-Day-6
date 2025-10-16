package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class LeapyearorNonleapyear {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a year :");
		int year=scanner.nextInt();
		String result=(year % 400 == 0) ? "Leap year" 
                : (year % 100 == 0) ? "Not a leap year" 
                : (year % 4 == 0) ? "Leap year" 
                : "Not a leap year";
		System.out.println(result);
		scanner.close();

	}

}
