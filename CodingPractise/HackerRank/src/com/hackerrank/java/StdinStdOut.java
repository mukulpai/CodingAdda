package com.hackerrank.java;

import java.util.Scanner;

public class StdinStdOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double d = in.nextDouble();
		String s = in.next();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + n);
		in.close();
	}

}
