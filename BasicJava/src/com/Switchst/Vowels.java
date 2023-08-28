package com.Switchst;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the names of Alphabets");
		char alphabets = sc.next().charAt(0);

		switch (alphabets) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':

			System.out.println(alphabets + " is a vowel.");
			break;

		default:
			System.out.println("it is a Consonant.");

		}
		sc.close();
	}
}
