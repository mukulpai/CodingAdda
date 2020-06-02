package com.hackerrank.thirtydayscode;

import java.util.Scanner;

public class Person {
	private int age;

	public Person(int initialAge) {
		if (initialAge > 0) {
			age = initialAge;
		} else {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}

	public void yearPasses() {
		age = age + 1;
	}

	public void amIOld() {
		if (age < 13) {
			System.out.println("You are young.");
		} else if (age >= 13 && age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int age = in.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		in.close();

	}
}
