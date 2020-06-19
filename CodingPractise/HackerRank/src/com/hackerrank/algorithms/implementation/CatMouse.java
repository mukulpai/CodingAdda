package com.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class CatMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();

		for (int i = 0; i < q; i++) {
			int cata = in.nextInt();
			int catb = in.nextInt();
			int mouse = in.nextInt();
			if (Math.abs(mouse - cata) == Math.abs(mouse - catb)) {
				System.out.println("Mouse C");
			} else if (Math.abs(mouse - cata) < Math.abs(mouse - catb)) {
				System.out.println("Cat A");
			} else {
				System.out.println("Cat B");
			}
		}
		in.close();
	}

}
