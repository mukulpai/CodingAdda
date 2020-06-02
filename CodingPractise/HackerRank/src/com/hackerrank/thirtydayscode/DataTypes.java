package com.hackerrank.thirtydayscode;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double d1 = in.nextDouble();
		String s1 = in.nextLine();
		in.close();

		System.out.println(i + n);
		System.out.println(d + d1);
		System.out.println(s + s1);
	}

}
