package com.hackerrank.java;

import java.util.Scanner;
import java.lang.Math;

public class Loops2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		int sum = 0;
		for (int i = 0; i < q; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					sum = sum + (a + (int) (((Math.pow(2, j)) * b)));
				} else {
					sum = sum + (int) (((Math.pow(2, j)) * b));
				}
				System.out.print(sum + " ");
			}
			sum = 0;
			System.out.println();
		}
		in.close();
	}
}
