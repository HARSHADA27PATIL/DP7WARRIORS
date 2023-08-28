package com.Switchst;

import java.util.Scanner;

public class WeekDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weekdys number(1-7):");
		int Weekdays = sc.nextInt();

		switch (Weekdays) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("error is inpit");
		}
		System.out.println("welcome to beutiful day");
		sc.close();
	}
}
