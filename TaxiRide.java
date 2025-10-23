package com.codegnan.operatorsexamples;

import java.util.Scanner;

public class TaxiRide {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter distance traveled (in km): ");
		
		int distance=scanner.nextInt();
		double fare=(distance<=2)?50:
			// first 2kms 50 and next 8kms are 8*15
							(distance<=10)?(50+(distance-2)*15):
			// first 2=50+next 8*15+above 10*10
								(50+(8*15)+(distance-10)*10);
		
		fare=(distance>20)?fare*0.95:fare;
		System.out.println(fare);
		
		
		/* double distance=scanner.nextDouble();
		double fare;

        fare = (distance <= 2) ? 50 :
               (distance <= 10) ? 50 + (distance - 2) * 15 :
               50 + (8 * 15) + (distance - 10) * 10;

        // Apply 5% discount if distance > 20 km
        fare = (distance > 20) ? fare * 0.95 : fare;

        System.out.println("Total fare: ₹" + fare); */

        scanner.close();

	}

}
