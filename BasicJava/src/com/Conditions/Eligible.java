package com.Conditions;

import java.util.Scanner;

public class Eligible {

public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the total percentage:");
	float percentage = sc.nextFloat();
	
	System.out.println("Enter the percentage of pcm :");
	float pcm = sc.nextFloat();
	
	if ((percentage>=90)||(percentage>=85))
	{
		System.out.println("Eligible");
	}
	else 
	{
		System.out.println(" not Eligible");
	}
	sc.close();	
	}
}
	
