package com.Conditions;
import java.util.Scanner;
import java.util.Date;
import java.util.Scanner;

public class MovieThicket {
public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome your thicket is book:");
			Date d=new Date();
			
			    System.out.println("Enter movie name:");
				String name = sc.next();
				
				System.out.println("Enter the rating:");
				float rating = sc.nextFloat();
				
				System.out.println("Enter the price:");
				Double price = sc.nextDouble();
				
				
				System.out.println("Enter the coupon_code:");
				int coupon_code = sc.nextInt();
				
				if (coupon_code==0) 
				{
					System.out.println("Rs.50%is off");
					double discount = price-50;
					System.out.println("your final thicket is book :" +discount);
				}
				else if (coupon_code==1)
				{
					System.out.println("Rs.100%is off");
					double discount = price-100;
					System.out.println("your final thicket is book :" +discount);
				}
				else
				{
					System.out.println("no discout you have to pay actual price :" +price);
				}
				System.out.println("Welcome on.."+d+" "+"you have book thicket for:"
				+name+" "+"Whose rating is "+rating+" "+"enjoy the movie....");
				
				sc.close();
}
}
