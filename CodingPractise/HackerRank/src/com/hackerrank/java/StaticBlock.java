package com.hackerrank.java;

import java.util.Scanner;

public class StaticBlock {
	static int breadth;
	static int height;
	static {
		Scanner in = new Scanner(System.in);
		breadth = in.nextInt();
		height = in.nextInt();
		in.close();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (breadth < 0 || height < 0) {
			System.out
					.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			System.out.println(breadth * height);
		}
	}

}
