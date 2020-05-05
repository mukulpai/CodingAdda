package com.arraysandstrings;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2_String {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		// Problem2_String p = new Problem2_String();
		char[] arr1 = s1.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = s2.toCharArray();
		Arrays.sort(arr2);

		if (String.valueOf(arr1).equals(String.valueOf(arr2))) {
			System.out.println("Strings are permutation");
		} else {
			System.out.println("Strings are not permutation");
		}
	}
}
