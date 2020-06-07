package com.hackerrank.algorithms.strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		in.close();
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 65 && s[i] <= 90) {
				count++;
			}
		}
		System.out.println(count + 1);
	}

}
