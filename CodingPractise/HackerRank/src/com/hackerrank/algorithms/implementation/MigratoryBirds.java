package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			int num = in.nextInt();
			arr[num] = arr[num] + 1;
		}
		int max = 0;

		for (int i = 0; i < N; i++) {
			if (arr[i] > max) {
				max = i;
			}
		}
		System.out.println(max);
		in.close();
	}

}