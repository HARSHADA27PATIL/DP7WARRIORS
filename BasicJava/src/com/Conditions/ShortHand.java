package com.Conditions;

public class ShortHand {
	public static void main(String [ ]args) {
		byte b1=70;
		byte b2=12;
		b1=(byte)(b1+b2);
		System.out.println(b1);
		byte num1=23;
		byte num2=10;
		//num1=num1+num2;
		num1+=num2;  // removes type casting
		System.out.println(num1);
		
		
		short s1=67;
		short s2=2;
		//short pro
		//s1=s1*s2
		System.out.println(s1);
		
		//char-int
		char ch='Z';
		System.out.println(ch);
		
	
	
		
		int value =ch;
		System.out.println(value);
		
		char c1= '8';
		char v1=c1;
		System.out.println(c1+" "+v1);
		
		
		char ch1='0'; 
		char ch2='5';
		char result=(char)(ch1+ch2);
		System.out.println(result);
		
		int i1=97;
		int i2=2;
		 char ch =(char)(i1+i2);
		 System.out.println(ch);
		 
		
		
		
		
	}
}