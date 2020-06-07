package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int index = in.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (i != index) {
				sum = sum + in.nextInt();
			} else {
				in.nextInt();
			}
		}
		int diff = sum / 2;
		int paid = in.nextInt();
		in.close();
		if (diff == paid) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(Math.abs(diff - paid));
		}

	}

}
