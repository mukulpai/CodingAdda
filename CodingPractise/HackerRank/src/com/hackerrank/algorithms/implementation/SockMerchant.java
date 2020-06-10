package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] arr = new int[101];

		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int index = in.nextInt();
			if (arr[index] != 0) {
				arr[index] = arr[index] + 1;
			} else {
				arr[index] = 1;
			}

		}
		in.close();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count = count + arr[i] / 2;
			}

		}
		System.out.println(count);
	}

}
