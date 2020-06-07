package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DivisibleSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

		int count = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if ((arr[i] + arr[j]) % k == 0) {
					count++;
				}

			}
		}
		in.close();
		System.out.println(count);
	}

}
