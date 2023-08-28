// Write a Java program to input any alphabet and check whether it is vowel or consonant 


package com.Conditions;
import java.util.Scanner;
public class Vowels {
	public static void main(String[]args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the names of Alphabets");
		char alphabets=sc.next().charAt(0);
		if(alphabets=='a'|| alphabets=='e'||alphabets=='i'||alphabets=='o'||alphabets=='u')
		{
			System.out.println(alphabets+" is a vowel.");
		}
		else
			System.out.println(alphabets+" is a Consonant.");
		}
	
}
