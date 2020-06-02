package com.hackerrank.java;

import java.util.Scanner;

public class OutputFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s = in.next();
			int n = in.nextInt();
			System.out.printf("%-12s %03d", s, n);
			System.out.println();
		}
		in.close();
		System.out.println("================================");
	}
}
