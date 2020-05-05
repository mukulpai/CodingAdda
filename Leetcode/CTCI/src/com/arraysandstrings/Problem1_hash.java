package com.arraysandstrings;

import java.util.HashMap;
import java.util.Scanner;

public class Problem1_hash {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Problem1_hash p1 = new Problem1_hash();
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
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			if (key == ' ') {
				continue;
			} else {
				if (hm.containsKey(key)) {
					flag = false;
				} else {
					hm.put(s.charAt(i), 1);
				}
			}
		}
		// for (Integer values : hm.values()) {
		// if (values > 1) {
		// flag = false;
		// }
		// }
		return flag;

	}
}
