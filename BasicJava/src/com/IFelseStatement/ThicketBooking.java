package com.IFelseStatement;

import java.util.Scanner;

public class ThicketBooking {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter your name of Airline:");
			String name_Airline = sc.next();
			
			System.out.println("Enter the department place:");
			String department_place = sc.next();
			
			System.out.println("Enter the destination place:");
			String destination_place = sc.next();
			
			
			System.out.println("Enter the coupon code if you have:");
			int coupon_code = sc.nextInt();
			double thicket_price=45000;
			if(coupon_code==5567) {
				
	System.out.println("we are providing 10% of discount on your thicket");
				double discount=thicket_price*0.10;
				System.out.println("your discount thicket price is :" +discount);
				thicket_price = thicket_price-discount;
				System.out.println("your final thicket price is :" +thicket_price );
			}
			else
				System.out.println(";no such coupon_code is availabe");
			System.out.println("your final thicket price is :" +thicket_price );
			System.out.println("your thicket is book enjoy your holiday");
			System.out.println("name_Airline:"+name_Airline
					+"department_place:"+department_place
					+"destination_place:"+destination_place);
	}
}
