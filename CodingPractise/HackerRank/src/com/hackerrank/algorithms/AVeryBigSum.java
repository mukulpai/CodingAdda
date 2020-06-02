package com.hackerrank.algorithms;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		long sum = 0;
		for (int i = 0; i < num; i++) {
			sum = sum + in.nextInt();
		}
		System.out.println(sum);
		in.close();
	}
}
