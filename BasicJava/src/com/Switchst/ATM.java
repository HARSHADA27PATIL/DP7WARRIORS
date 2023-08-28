package com.Switchst;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO HDFC ATM");
		int balance = 10000;
		int pin = 1234;
		System.out.println("Enter the pin");
		int pin1 = sc.nextInt();

		if (pin1 == pin) {

			System.out.println("1 Deposite");

			System.out.println("2 withdraw");

			System.out.println("3 check balance");

			System.out.println("4 exit");

			System.out.println("Enter choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter amount to deposite");
				int depamount = sc.nextInt();
				balance = balance + depamount;
				System.out.println("after deposite amount:" + balance);
				break;

			case 2:
				System.out.println("Enter amount to withdraw");
				int wiamount = sc.nextInt();
				balance = balance - wiamount;
				System.out.println("after withdraw amount:" + balance);
				break;
			case 3:
				System.out.println("check the balance " + balance);
				break;
			case 4:
				System.out.println("Exit");
				break;
			default:
				System.out.println("invalid choice");
			}
		}
		else 
		{
			System.out.println("please enter correct pin");
		}

		sc.close();
	}
}
