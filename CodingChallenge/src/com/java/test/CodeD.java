package com.java.test;

import java.util.Scanner;

public class CodeD {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two integers (a and b) to find GCD of those numbers");
		
		System.out.println("Enter first integer:");
		//Accepting first number
		int a = s.nextInt();
		
		System.out.println("Enter second integer:");
		//Accepting second number
		int b = s.nextInt();
		
		//int a2 = a > 0 ? a : -a;
		//int b2 = b > 0 ? b : -b;
		
		//Calling the getGCD() to get the GCD of the two numbers
		int output = getGCD(a , b);
		
		System.out.println("The GCD of " + a + " and " + b + " is: " + output);
		
	}
	
	public static int getGCD(int a, int b) {
		
		/*Using a recursive function to calculate GCD of two numbers
		 * I will be calling getGCD() until the parameter b becomes 0.
		 * I am passing the remainder of a and b to b as I'm interested only in the largest common number
		 */
		if(b == 0) {
			return a;
		}
		
		return getGCD(b, a%b);
	}
}
