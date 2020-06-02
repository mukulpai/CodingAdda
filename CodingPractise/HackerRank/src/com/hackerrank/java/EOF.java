package com.hackerrank.java;

import java.util.Scanner;

public class EOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i = 1;
		while (in.hasNext()) {
			String line = in.nextLine();
			System.out.println(i + " " + line);
			i++;
		}
		in.close();
	}

}
