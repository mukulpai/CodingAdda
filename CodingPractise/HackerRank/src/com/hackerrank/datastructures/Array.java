package com.hackerrank.datastructures;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr = new int[size];

		// insert elements into array
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}

		// print reverse
		for (int i = size - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		in.close();
	}
}
