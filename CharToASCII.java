package com.codegnan.operatorsexamples;
import java.util.Scanner;

public class CharToASCII {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a character: ");
        char ch = scanner.next().charAt(0); 
        
        int asciiValue = (int) ch;

        System.out.println(asciiValue);

        scanner.close();
    }
}