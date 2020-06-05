package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		in.close();
		String s = "";
		boolean meet = false;

		for (int i = 0; i < 10000; i++) {
			x1 = x1 + v1;
			x2 = x2 + v2;
			if (Math.abs(x1 - x2) == Math.abs(v1 - v2)) {
				meet = true;
			}

		}
		if (meet) {
			s = "YES";
		} else {
			s = "NO";
		}
		System.out.println(s);
	}

}
