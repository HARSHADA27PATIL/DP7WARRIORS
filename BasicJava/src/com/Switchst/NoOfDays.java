package com.Switchst;

import java.util.Scanner;

public class NoOfDays {
	public static void main(String [] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the month name(lowercase):");
		String mName=sc.next();
		
		//int monthNo =sc.nextInt();
		//if (monthNo==1)||(monthNo==3)||(monthNo==4)||.....and so on
		
		switch (mName)
		{
			case"january":
			case"march":
			case"may":
			case"july":
			case"august":
			case"october":
			case"december":System.out.println("31days");
			break;
			case"april":
			case"june":
			case "september":
			case "november":System.out.println("30days");
			break;
			case "february": System.out.println("Enter the year");
			int year=sc.nextInt();
			if ((year%400==0)||(year%4!=0)||(year%100==0))
			{
				System.out.println("29days");
			}
			else
			{
				System.out.println("28days");
		    }
			break;
			default: System.out.println("error in input");
		}
		sc.close();
	}

}
