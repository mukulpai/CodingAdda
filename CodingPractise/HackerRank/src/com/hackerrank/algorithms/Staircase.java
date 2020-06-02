package com.hackerrank.algorithms;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = "";
		for (int i = 0; i < n; i++) {
			s = s.concat("#");
			System.out.printf("%" + n + "s\n", s);
		}
		in.close();
	}
}
