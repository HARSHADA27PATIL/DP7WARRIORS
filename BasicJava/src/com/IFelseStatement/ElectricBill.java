//Write a Java program to input electricity consumption unit and calculate totalelectricity billaccording to the given 
//condition: 
//For first 50 units Rs. 0.50/
//unit For next 100 units Rs. 0.75/
//unit For next 100 units Rs. 1.20/
//unit For unit 
//above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill

package com.IFelseStatement;

import java.util.Scanner;

public class ElectricBill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the electric consumption unit");
		int unit = sc.nextInt();
		if (unit <= 50) {
			System.out.println("for next 50 unit" + 50 * 0.5);
		} else if (unit <= 150) {
			System.out.println("for next 100 unit" + 100 * 0.75);
		} else if (unit <= 250) {
			System.out.println("for next 100 unit" + 100 * 1.20);
		} else {
			System.out.println("for next 250 unit" + (unit - 250) * 1.5);
		}

		sc.close();
	}
}
