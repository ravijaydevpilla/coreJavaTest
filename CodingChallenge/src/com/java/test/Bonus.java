package com.java.test;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your input string:");
		String input = s.nextLine();
		
		boolean output = isPalindrome(input);
		
		if(output)
			System.out.println("The given string is a palindrome");
		else
			System.out.println("The given string is not a palindrome");
	}
	
	public static boolean isPalindrome(String input) {
		
		/*I have programmed the function in such a way that I am ignoring the widespaces and case
		 * as I want to check if the content of a string is same
		 */
		
		String str = input.replaceAll("\\s+", "").toLowerCase();
		//StringBuilder is better when we want to modify a string
		StringBuilder s = new StringBuilder(str);
		StringBuilder reverse = s.reverse();
		System.out.println("Reverse str is: " + reverse);
		
		return (reverse.toString()).equals(str);
	}
}
