package com.arraysandstrings;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Problem1 p1 = new Problem1();
		if (p1.isUnique(s)) {
			System.out.println("String is Unique");
		} else {
			System.out.println("String is not Unique");
		}
		in.close();
	}

	private boolean isUnique(String s) {
		// TODO Auto-generated method stub
		boolean flag = true;
		outer: for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if ((s.charAt(i) == s.charAt(j)) && (s.charAt(i) != ' ')) {
					flag = false;
					break outer;
				}
			}
		}
		return flag;

	}
}
