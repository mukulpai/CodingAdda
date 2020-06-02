package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		int point1 = x1;
		int point2 = x2;
		in.close();
		while (point1 != point2) {
			point1 = point1 + v1;
			point2 = point2 + v2;
		}
		if ((point1 == point2) && point1 != x1) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
