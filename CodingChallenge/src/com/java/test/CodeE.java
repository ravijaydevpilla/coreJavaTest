package com.java.test;

import java.util.Scanner;

public class CodeE {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a positive integer to find its nth fibonacci number:");
		//Accepting a positive integer as input
		int n = s.nextInt();
		
		int output = getFibonacci(n);
		System.out.println("The nth Fibonacci of " + n + " is: " + output);
		System.out.println("The time complexity for this program is O(n)");
		
	}
	public static int getFibonacci(int n) {
		/*The first two elements of a fibonacci series are 0 and 1
		 * Because we have 0 and 1, the first two iterations are done.
		 * So, I have iterated the loop after 2 until n.
		 */
		int a = 0, b = 1, c;
		for(int i = 2; i < n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		return b;
	}
}
