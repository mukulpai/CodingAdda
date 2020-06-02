package com.hackerrank.java;

import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int month = in.nextInt() - 1;
		int date = in.nextInt();
		int year = in.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, date);
		System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.LONG, Locale.UK).toUpperCase());
		in.close();

	}
}
