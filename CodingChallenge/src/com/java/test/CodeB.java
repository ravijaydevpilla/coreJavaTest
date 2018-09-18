package com.java.test;

import java.util.Scanner;

public class CodeB {

	public static void main(String[] args) {
		
		int input;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an integer to find its square root:");
		//Accepting an integer input
		input = s.nextInt();
		
		//Called getSqrtUsingfirstMethod() that uses Math.sqrt() to calculate the square root of an integer
		double sqrt1 = getSqrtUsingFirstMethod(input);
		System.out.println("The square root of " + input + " using getSqrtUsingfirstMethod() is: " + sqrt1);
	
		double sqrt2 = getSqrtUsingSecondMethod(input);
		System.out.println("The square root of " + input + " using getSqrtUsingSecondMethod() is: " + sqrt2);

	}
	
	public static double getSqrtUsingFirstMethod(int input) {
		
		return Math.sqrt(Math.abs(input));
	}
	
	public static double getSqrtUsingSecondMethod(int input) {
		double x1 = (input *1.0)/2;
		double x2 = (x1 + (input/x1))/2;
		while(Math.abs(x1 - x2) >= 0.0000001) {
			x1 = x2;
			x2 = (x1 + (input / x1)) / 2;
			
		}
		return x2;
	}
}
