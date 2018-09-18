package com.java.test;

import java.util.Scanner;

public class CodeC {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a positive integer to find the reverse of the given number:");
		//Accepting a positive integer as input
		int input = s.nextInt();
		
		//Called a getReverse() that calculates the reverse of a number
		int output = getReverse(input);
		
		System.out.println("The reverse of the given number is: " + output);
	
	}
	public static int getReverse(int number) {
		
		/*I have calculated the reverse of a number by extracting the
		 *right most element and assigning it to a new variable until there is no element is available
		 */
		int rev = 0;
		while(number != 0) {
			rev = rev * 10;
			rev = rev + number % 10;
			number = number / 10;
		}
		
		return rev;
	}
}
