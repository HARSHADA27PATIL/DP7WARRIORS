package TernaryOperators;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		String status;
		status = (year % 4 == 0 && year % 100 != 0 ? "leap year" : "not a leap year:");
		System.out.println(status);

		sc.close();
	}
}
