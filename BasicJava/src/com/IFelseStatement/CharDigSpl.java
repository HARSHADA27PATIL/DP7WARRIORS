// Write a Java program to input any character 
//and check whether it is alphabet, digit or special character


package com.IFelseStatement;
import java.util.Scanner;
public class CharDigSpl{
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any char");
	char ch=sc.next().charAt(0);
	
	if (ch>='a' && ch<='z') {
		System.out.println(ch+"it is alphabet");
	}else if (ch>=0 && ch<=8) {
		System.out.println(ch+"it is digit");
	}else if (ch>=97 && ch<=122) {
			System.out.println(ch+"it is capital alphabet");
	}else
		 {
				System.out.println("it is a special character");
			}
			sc.close();
	}
	}
	
