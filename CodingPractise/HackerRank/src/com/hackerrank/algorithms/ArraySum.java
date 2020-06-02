package com.hackerrank.algorithms;

import java.util.Scanner;

public class ArraySum {
	static int simpleArraySum(int[] ar) {
		/*
		 * Write your code here.
		 */
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum = sum + ar[i];
		}
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] ar = new int[length];
		for (int i = 0; i < length; i++) {
			ar[i] = in.nextInt();
		}
		int sum = ArraySum.simpleArraySum(ar);
		System.out.println(sum);
		in.close();
	}
}
