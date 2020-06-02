package com.hackerrank.algorithms;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int arrsize = in.nextInt();
		float zero = 0;
		float pos = 0;
		float neg = 0;
		for (int i = 0; i < arrsize; i++) {
			int n = in.nextInt();
			if (n == 0) {
				zero++;
			} else if (n > 0) {
				pos++;
			} else {
				neg++;
			}
		}
		System.out.printf("%.6f\n", pos / arrsize);
		System.out.printf("%.6f\n", neg / arrsize);
		System.out.printf("%.6f\n", zero / arrsize);
		in.close();
	}
}
