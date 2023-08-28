// Write a Java program to find maximum between three numbers 

package com.Conditions;
import java.util.Scanner;
public class Maximum {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Entry any three number:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1 +"is greates");
			}
			else
			
		    {
				System.out.println(num3 +"is greates");
			}
		}
		else
		{
			if(num2>num3)
			{
		      System.out.println(num2+"is greater");
			}
			else 
			{
				System.out.println(num3+"is greater");	
			}
		
		}
			sc.close();
	}
	}
