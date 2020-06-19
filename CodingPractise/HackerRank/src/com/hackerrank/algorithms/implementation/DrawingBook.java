package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DrawingBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int p = in.nextInt();

		if (n - p < p - 1) {
			System.out.println(n / 2 - p / 2);
		} else {
			System.out.println(p / 2);
		}
		in.close();
	}

}
