package com.hackerrank.algorithms.strings;

import java.util.Scanner;

public class SuperReducedString {

//	static String superReducedString(String s) {
//
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		StringBuilder s1 = new StringBuilder(s);
		in.close();
		int len = s1.length();
		int i = 0;
		while (i < len - 1) {
			if (s1.charAt(i) == s1.charAt(i + 1)) {
				s1.deleteCharAt(i);
				s1.delete(i, i + 1);
				i = 0;
				len = s1.length();
			} else {
				i++;
			}

		}
		System.out.println(s1.toString());
	}

}
