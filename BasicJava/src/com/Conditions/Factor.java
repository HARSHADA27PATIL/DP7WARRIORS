package com.Conditions;
import java.util.Scanner;
public class Factor {
	public static void main (String[ ]args) {
	
	Scanner sc=new Scanner (System.in);
	
	System.out.println("Enter the num");
	int num=sc.nextInt();
	
	System.out.println("Enter the factor");
	int factor=sc.nextInt();
	if (num%factor==0)

	
	{System.out.println(factor+"is a factor of "+num);
		
	}
	else
	{
	System.out.println(factor+"is not a factor "+num);
	}
	sc.close();

}
}