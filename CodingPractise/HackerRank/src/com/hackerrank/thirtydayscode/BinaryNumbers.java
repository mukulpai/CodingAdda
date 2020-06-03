package com.hackerrank.thirtydayscode;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		int max = 0;
		while (num > 0) {
			System.out.print(num % 2);
			if (num % 2 == 1) {
				count++;
				if (count >= max)
					max = count;
			} else {
				count = 0;
			}
			num = num / 2;
		}
		System.out.println();
		System.out.println(max);
		in.close();
	}

}
