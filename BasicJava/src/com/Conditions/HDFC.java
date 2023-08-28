package com.Conditions;
import java.util.Scanner;
public class HDFC {

	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("WELCOME TO HDFC ATM");
		int balance=10000;
		System.out.println("Enter the pin");
		int pin =1234;
		
		if(pin==1234)
		{
			System.out.println("1 Deposite");
			System.out.println("2 withdraw");
			System.out.println("3 check balance");
			System.out.println("4 exit");
		
			System.out.println("Enter choice");
			int choice =sc.nextInt();
	
		if (choice==1)
		{
			System.out.println("Enter amount to deposite");
			int depamount= sc.nextInt();
			balance = balance +depamount;
			System.out.println("after deposite amount:"+balance);
			}
		else if (choice==2)
		{
			System.out.println("Enter amount to withdraw");
			int wiamount= sc.nextInt();
			balance = balance - wiamount;
			System.out.println("after withdraw amount:"+balance);
			}
		}
		else
		{
			System.out.println("please type  correct password");
		}
		sc.close();
	}
	}
	


