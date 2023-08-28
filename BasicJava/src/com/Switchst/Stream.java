package com.Switchst;

import java.util.Scanner;

public class Stream {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose your stream");
		String stream = sc.next();

		System.out.println("Enter percentage");
		int percentage = sc.nextInt();

		switch (stream) {
		   case "MBA":
		             System.out.println("you are choosing MBA");
			switch (percentage) 
			{
			case 75:
				System.out.println("you got admission for MBA");
				break;
				default:
					System.out.println("You dont get the admission");
			}
			break;
		   
			
		case "MCA":
			System.out.println("you are choosing MCA");
			
			switch (percentage) {
			
			case 70:
				System.out.println("you got admission for MCA");
				break;
			default:
				System.out.println("Enter correct percentage ");
			}
			break;
			default:System.out.println("Enter corect stream");
		}
		sc.close();
	}

}
