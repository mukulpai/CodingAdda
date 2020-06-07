package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BreakingRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int high = 0;
		int low = 0;
		int counthigh = 0;
		int countlow = 0;
		for (int i = 0; i < N; i++) {
			int score = in.nextInt();
			if (i == 0) {
				high = low = score;
			}
			if (score > high) {
				high = score;
				counthigh++;
			} else if (score < low) {
				low = score;
				countlow++;
			}
		}
		in.close();
		System.out.println(counthigh + "  " + countlow);
	}

}
