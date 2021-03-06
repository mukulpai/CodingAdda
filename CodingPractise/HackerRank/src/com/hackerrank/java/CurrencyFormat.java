package com.hackerrank.java;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class CurrencyFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble();
		in.close();
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		String us = nf.format(number);
		System.out.println("US: " + us);

		NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("en",
				"in"));
		String india = nf1.format(number);
		System.out.println("India: " + india);

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = nf2.format(number);
		System.out.println("China: " + china);

		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = nf3.format(number);
		System.out.println("France: " + france);
	}

}
