package com.hackerrank.thirtydayscode;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mealcost = in.nextDouble();
		double tip = in.nextFloat() / 100.00;
		double tax = in.nextFloat() / 100.00;

		double tipValue = (tip) * mealcost;
		double taxValue = (tax) * mealcost;

		System.out.println((int) Math.round((mealcost + tipValue + taxValue)));
		in.close();
	}
}
