package com.hackerrank.java;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				if (sum < 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		in.close();
	}

}
