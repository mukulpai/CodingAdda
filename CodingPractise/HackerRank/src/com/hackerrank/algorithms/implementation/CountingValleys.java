package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {
		char[] c = s.toCharArray();

		int sum = 0;
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'D') {
				sum = sum - 1;
			} else {
				sum = sum + 1;
			}
			if (sum == 0 && (i > 0 && c[i] == 'U')) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();

		System.out.println(CountingValleys.countingValleys(n, s));
		in.close();
	}

}
