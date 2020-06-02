package com.hackerrank.thirtydayscode;

import java.util.Scanner;

public class Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= 10; i++) {
			int product = i * n;
			System.out.println(n + " x " + i + " = " + product);
		}
		in.close();
	}

}
