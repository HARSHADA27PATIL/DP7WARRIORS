package TernaryOperators;

import java.util.Scanner;

public class GreaterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2");
		int num2 = sc.nextInt();
		System.out.println("Enter the num3");
		int num3 = sc.nextInt();

		int max = (num1 > num2) ? (num1 > num3) ? num1 : num3 : (num2 > num3) ? num2 : num3;
		System.out.println(max + "is greater");

		int max2 = ((num1 > num2) && (num1 > num3)) ? num1 : (num2 > num3) ? num2 : num3;
		System.out.println(max + "is greater");
		sc.close();
	}
}
