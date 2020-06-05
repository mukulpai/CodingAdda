package com.hackerrank.java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class SubstringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int k = in.nextInt();
		in.close();
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i <= s.length() - k; i++) {
			String next = s.substring(i, i + k);
			arr.add(next);

		}
		arr.sort(null);
		System.out.println(arr.get(0));
		System.out.println(arr.get(arr.size() - 1));

	}
}
