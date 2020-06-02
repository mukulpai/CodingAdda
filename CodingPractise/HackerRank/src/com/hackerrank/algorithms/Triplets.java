package com.hackerrank.algorithms;

import java.util.*;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] l1 = in.nextLine().split(" ");
		String[] l2 = in.nextLine().split(" ");
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < l1.length; i++) {
			if (Integer.valueOf(l1[i]) > Integer.valueOf(l2[i])) {
				alice++;
			}
			if (Integer.valueOf(l1[i]) < Integer.valueOf(l2[i])) {
				bob++;
			}
		}
		System.out.println(alice + " " + bob);
		in.close();
	}
}
