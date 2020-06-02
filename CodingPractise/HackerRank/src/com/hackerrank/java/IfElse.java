package com.hackerrank.java;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n % 2 != 0) {
			System.out.println("Weird");
		} else {
			if (n >= 2 && n <= 5) {
				System.out.println("Not Weird");
			} else if (n >= 6 && n <= 20) {
				System.out.println("Weird");
			} else {
				System.out.println("Not Weird");
			}
		}
		in.close();
	}

}
