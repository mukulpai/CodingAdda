package com.hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;
/**
 * O(n2)
 * @author MUKULPAI
 *
 */
public class MinMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int first = 0;
		int last = 0;
		int[] arr = new int[5];

		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				first = arr[i];
			}
			if (i == 4) {
				last = arr[i];
			}
			sum = sum + arr[i];
		}
		System.out.print((sum - last) + " " + (sum - first));
		in.close();
	}
}
