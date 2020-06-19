package com.hackerrank.thirtydayscode;

import java.util.Scanner;

public class NestedLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int act_date = in.nextInt();
		int act_month = in.nextInt();
		int act_year = in.nextInt();

		int date = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();
		int sum = 0;
		if (act_year == year && act_month == month && act_date > date) {
			sum = sum + ((act_date - date) * 15);
		} else if (act_year == year && act_month > month) {
			sum = sum + ((act_month - month) * 500);
		} else if (act_year > year) {
			sum = 0;
			sum = 10000;
		}

		System.out.println(sum);
		in.close();
	}

}
