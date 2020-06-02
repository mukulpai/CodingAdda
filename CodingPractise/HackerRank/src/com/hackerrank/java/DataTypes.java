package com.hackerrank.java;

import java.util.Scanner;
import java.lang.Math;

public class DataTypes {

	// byte - 8 bits -2^7
	// short - 16 bits -2^15
	// int - 32 bits -2^31
	// long 64 bits - 2^64
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		for (int i = 0; i < N; i++) {
			try {
				long x = in.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				if (x >= -32768 && x <= 32767) {
					System.out.println("* short");
				}
				if (x >= -(Math.pow(2, 31)) && x <= (Math.pow(2, 31) - 1)) {
					System.out.println("* int");
				}
				if (x >= -(Math.pow(2, 63)) && x <= (Math.pow(2, 63) - 1)) {
					System.out.println("* long");
				}
			} catch (Exception e) {
				System.out.println(in.next() + " can't be fitted anywhere.");
			}
		}
		in.close();
	}
}
