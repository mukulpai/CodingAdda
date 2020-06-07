package com.hackerrank.projecteuler;

import java.util.Scanner;

public class Multiple3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			int N = in.nextInt();
			int sum = 0;
			for (int i = 1; i < N; i++) {
				if (i % 5 == 0 || i % 3 == 0) {
					sum = sum + i;
				}
			}
			System.out.println(sum);
		}
		in.close();
	}

}
