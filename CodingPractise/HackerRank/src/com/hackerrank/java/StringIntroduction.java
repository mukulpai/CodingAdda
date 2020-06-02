package com.hackerrank.java;

import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		// brute force code not using String capabilities
		// char[] s1 = in.nextLine().toCharArray();
		// char[] s2 = in.nextLine().toCharArray();
		// in.close();
		// System.out.println(s1.length + s2.length);
		//
		// if (Integer.valueOf(s1[0]) > Integer.valueOf(s2[0])) {
		// System.out.println("Yes");
		// } else {
		// System.out.println("No");
		// }
		// s1[0] = String.valueOf(s1[0]).toUpperCase().toCharArray()[0];
		// s2[0] = String.valueOf(s2[0]).toUpperCase().toCharArray()[0];
		// for (int i = 0; i < s1.length; i++) {
		// System.out.print(s1[i]);
		// }
		// System.out.print(" ");
		// for (int i = 0; i < s2.length; i++) {
		// System.out.print(s2[i]);
		// }

		// Using String capabilities
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		in.close();
		// print length
		System.out.println(s1.length() + s2.length());

		// compare lexicographically
		if (s1.compareTo(s2) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		// capitalize first letter
		System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1)
				+ " " + s2.substring(0, 1).toUpperCase() + s2.substring(1));
	}
}
