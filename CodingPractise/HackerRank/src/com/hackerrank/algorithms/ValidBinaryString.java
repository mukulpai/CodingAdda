package com.hackerrank.algorithms;

import java.util.Scanner;

public class ValidBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char[] arr = in.nextLine().toCharArray();
		int k = in.nextInt();
		int count = 0;
		for (int i = 0; i <= arr.length - k; i++) {
			for (int j = i; j < i + k; j++) {
				if (arr[j] == '1') {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
		in.close();
	}
}
