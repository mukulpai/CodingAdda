package com.hackerrank.java;

import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {

	static boolean isAnagram(String a, String b) {

		char[] a1 = a.toLowerCase().toCharArray();
		char[] b1 = b.toLowerCase().toCharArray();

		Arrays.sort(a1);
		Arrays.sort(b1);

		if (String.valueOf(a1).equals(String.valueOf(b1))) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		in.close();
		boolean ret = isAnagram(a, b);
		System.out.print((ret) ? "Anagrams" : "Not Anagrams");
	}

}
