package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class AppleOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int range1 = in.nextInt();
		int range2 = in.nextInt();
		int appletree = in.nextInt();
		int orangetree = in.nextInt();
		int apples = in.nextInt();
		int oranges = in.nextInt();
		int applecount = 0;
		int orangecount = 0;
		for (int i = 0; i < apples; i++) {
			int app = in.nextInt();
			if ((appletree + app) >= range1 && (appletree + app) <= range2) {
				applecount++;
			}
		}
		for (int i = 0; i < oranges; i++) {
			int org = in.nextInt();
			if ((orangetree + org) >= range1 && (orangetree + org) <= range2) {
				orangecount++;
			}
		}
		System.out.println(applecount);
		System.out.println(orangecount);
		in.close();
	}

}
