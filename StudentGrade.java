package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt();

        char grade = (marks >= 90) ? 'A' :
                     (marks >= 80) ? 'B' :
                     (marks >= 70) ? 'C' :
                     (marks >= 60) ? 'D' :
                     (marks >= 50) ? 'E' : 'F';

        System.out.println("Grade: " + grade);

        scanner.close();
    }
} 