package com.hackerrank.java;

import java.util.Scanner;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine().trim();
		if (s.length() == 0) {
			System.out.println(0);
		} else if (s.length() > 0 && s.length() <= 400000) {
			String[] s1 = s.split("[ !,?._'@]+");
			System.out.println(s1.length);
			for (int i = 0; i < s1.length; i++) {
				System.out.println(s1[i]);
			}
		}
		in.close();
	}

}
