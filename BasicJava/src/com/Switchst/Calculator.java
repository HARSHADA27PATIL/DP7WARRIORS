package com.Switchst;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2:");
		int num2 = sc.nextInt();

		System.out.println("Enter which operation you want to perform(1.+,2.-,3.*,4./,5.%)");
		int char = sc.nextInt();

		switch (char) {
		case 1:
			System.out.println("Addition of two no:" + (num1 + num2));
			break;
		case 2:
			System.out.println("Substraction of two no:" + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication of two no:" + (num1 * num2));
			break;
		case 4:
			System.out.println("Division of two no:" + (num1 / num2));
			break;
		case 5:
			System.out.println("Modulus of two no" + (num1 % num2));
			break;
		}
		sc.close();

	}
}
