//Write a Java program to create Simple Calculator   

package com.IFelseStatement;
import java.util.Scanner;
public class Calculator {
	
public static void main(String []args) {
	Scanner sc= new Scanner (System.in);
	System.out. println("Enter the num1:");
	int num1= sc.nextInt();
	System.out.println("Enter the num2:");
	int num2 = sc.nextInt();
	
	System.out.println("Addition of two no:"+(num1+num2));
	System.out.println("Substraction of two no:"+(num1-num2));
	System.out.println("Multiplication of two no:"+(num1*num2));
	System.out.println("Division of two no:"+(num1/num2));
	System.out.println("Modulus of two no"+(num1%num2));
	sc.close();
	
}
}
