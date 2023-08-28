package com.Conditions;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	System.out. println("Enter your gender:");
	char gender =sc.next().charAt(0);
	System.out. println("Enter your age:");
	int age=sc.nextInt();
	System.out. println("Enter your weight:");
	int weight=sc.nextInt();
	if (gender =='F')
			{
	   if(age>=18)
	{
		if(weight>=70) 
		{
	
		System.out.println("You are eligible for donate blood");
	     }
	
	    else
	    {  
	    	System.out.println("You are  underweight");
	    }
	}
			}
	else
	{
		
		System.out.println("You are  not eligible for donate blood");
		
	}
	sc.close();
			}}
