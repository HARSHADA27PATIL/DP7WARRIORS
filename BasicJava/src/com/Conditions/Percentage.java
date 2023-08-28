package com.Conditions;

public class Percentage {
	public static void main (String [] args) {
	float per =57f;
	if (per>=65)
	{
		System.out.println("Eligible for college..");
		if (per>=80);
		{
			System.out.println("can opt science and commerce stream");
		}
		else
		{
			System.out.println("can opt commerce stream");
		}
	}
	else  
	{
		System.out.println("not eligible for college");
	}
}

}
