package com.hackerrank.algorithms.implementation;

import java.util.Scanner;
import java.util.Arrays;

public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		/*
		 * Write your code here.
		 */
		Arrays.sort(keyboards);
		Arrays.sort(drives);

		int max = 0;
		for (int i = keyboards.length - 1; i >= 0; i--) {
			for (int j = drives.length - 1; j >= 0; j--) {
				if (drives[j] + keyboards[i] <= b) {
					if (drives[j] + keyboards[i] > max) {
						max = drives[j] + keyboards[i];
					}
				}
			}
		}
		return (max > 0 ? max : -1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();

		int n = in.nextInt();
		int m = in.nextInt();
		int[] key = new int[n];
		int[] usb = new int[m];

		for (int i = 0; i < n; i++) {
			key[i] = in.nextInt();
		}

		for (int j = 0; j < m; j++) {
			usb[j] = in.nextInt();
		}

		System.out.println(ElectronicsShop.getMoneySpent(key, usb, b));
		in.close();
	}

}
