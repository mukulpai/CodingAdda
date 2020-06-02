package com.hackerrank.algorithms;

import java.util.Scanner;

public class MinMaxSum_onepass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long sum = 0;
		long max = 0;
		long min = 1000000000;
		for (int i = 0; i < 5; i++) {
			long num = in.nextLong();

			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			sum = sum + num;
		}
		System.out.println((sum - max) + " " + (sum - min));
		in.close();
	}

}
