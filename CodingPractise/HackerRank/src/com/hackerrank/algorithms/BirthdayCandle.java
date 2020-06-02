package com.hackerrank.algorithms;

import java.util.Scanner;

public class BirthdayCandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		int max = 0;
		for (int i = 0; i < num; i++) {
			int n = in.nextInt();
			if (n > max) {	
				max = n;
				count = 1;
			} else if (n == max) {
				count++;
			}
		}

		// HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		// int c = 0;
		// for (int i = 0; i < num; i++) {
		// int d = in.nextInt();
		// if (d >= max) {
		// max = d;
		// if (count.isEmpty())
		// count.put(d, 1);
		// else {
		// c = count.get(d);
		// count.put(d, c++);
		// }
		// }
		// }
		System.out.println(count);
		in.close();
	}

}
