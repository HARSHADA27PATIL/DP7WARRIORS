package com.Switchst;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num 1-5");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		}
		sc.close();
	}
}
