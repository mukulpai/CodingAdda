package com.hackerrank.thirtydayscode;

import java.util.Scanner;

public class StringSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		for (int i = 0; i < T; i++) {
			char[] s = in.nextLine().toCharArray();
			String even = "";
			String odd = "";
			for (int j = 0; j < s.length; j++) {
				if (j % 2 == 0) {
					even = even.concat(String.valueOf(s[j]));
				} else {
					odd = odd.concat(String.valueOf(s[j]));
				}
			}
			System.out.println(even + " " + odd);
		}
		in.close();

	}
}
