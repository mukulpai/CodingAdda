package com.hackerrank.java;

import java.util.Scanner;

public class SubstringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int k = in.nextInt();
		in.close();
		String temp = "";
		String small = "";
		String max = "";
		for (int i = 0; i <= s.length() - k; i++) {
			String next = s.substring(i, i + k);
			if (small.isEmpty()) {
				temp = next;
			} else if (next.compareTo(temp) < 0) {
				small = next;
				temp = next;
			} else if (next.compareTo(temp) > 0) {
				max = next;
				temp = next;
			}

		}
		System.out.println(small);
		System.out.println(max);
	}
}
