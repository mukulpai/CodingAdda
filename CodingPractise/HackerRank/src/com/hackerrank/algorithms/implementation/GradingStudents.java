package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class GradingStudents {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for (int i = 0; i < num; i++) {
			int marks = in.nextInt();
			int finalgrade = 0;
			if (marks >= 38) {
				if (marks % 5 >= 3) {
					finalgrade = marks + (5 - marks % 5);
				} else {
					finalgrade = marks;
				}
			} else {
				finalgrade = marks;
			}
			System.out.println(finalgrade);
		}
		in.close();

	}
}
