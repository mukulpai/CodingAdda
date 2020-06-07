package com.hackerrank.java;

import java.util.Scanner;

public class BigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		java.math.BigInteger b1 = new java.math.BigInteger(in.next());
		java.math.BigInteger b2 = new java.math.BigInteger(in.next());
		System.out.println(b1.add(b2));
		System.out.println(b1.multiply(b2));
		in.close();
	}

}
