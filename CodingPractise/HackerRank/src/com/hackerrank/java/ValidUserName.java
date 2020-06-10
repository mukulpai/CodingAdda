package com.hackerrank.java;

import java.util.Scanner;

public class ValidUserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		while (n-- > 0) {
			String s = in.nextLine();

//				Pattern p = Pattern.compile("^([a-z]|[A-Z])_[0-9]");
//				Matcher m = p.matcher(s);
//				if (m.find()) {
//					System.out.println("VALID");
//				} else {
//					System.out.println("INVALID");
//				}
			if (s.matches("^[A-Za-z]\\w{7,29}$")) {
				System.out.println("VALID");
			} else {
				System.out.println("INVALID");
			}

		}
		in.close();
	}

}
