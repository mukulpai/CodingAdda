package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class DayoftheProgrammer {

	static String dayOfProgrammer(int year) {
		// 1918
		if (year == 1918) {
			return "26.09." + year;
		}
		if (year >= 1700 && year <= 1917) {
			if (isLeap(year, true)) {
				return "12.09." + year;
			} else {
				return "13.09." + year;
			}
		} else {
			if (isLeap(year, false)) {
				return "12.09." + year;
			} else {
				return "13.09." + year;
			}
		}

	}

	static boolean isLeap(int year, boolean julian) {
		// TODO Auto-generated method stub
		if (julian && year % 4 == 0) {
			return true;
		} else {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String month = "09";
		String day = DayoftheProgrammer.dayOfProgrammer(year);

		System.out.println(day + "." + month + "." + year);
		in.close();
	}

}
