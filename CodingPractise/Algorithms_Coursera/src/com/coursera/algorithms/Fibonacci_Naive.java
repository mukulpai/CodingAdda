package com.coursera.algorithms;

import java.util.Scanner;

public class Fibonacci_Naive {

	public long calculateFibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
		}
	}
	// 0 1 1 2 3 5 8 13
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		Fibonacci_Naive fn = new Fibonacci_Naive();
		long result = fn.calculateFibonacci(n);
		System.out.println(result);

	}

}
