package com.hackerrank.thirtydayscode;

public class InheritanceStudent extends InheritancePerson {

	private int[] testScores;
	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */
	// Write your constructor here

	InheritanceStudent(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.testScores = testScores;

	}

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here
	char calculate() {
		float sum = 0;
		float avg = 0;
		for (int i = 0; i < testScores.length; i++) {
			sum = sum + testScores[i];
		}
		avg = sum / testScores.length;
		if (avg >= 90) {
			return 'O';
		} else if (avg >= 80) {
			return 'E';
		} else if (avg >= 70) {
			return 'A';
		} else if (avg >= 55) {
			return 'P';
		} else if (avg >= 40) {
			return 'D';
		} else {
			return 'T';
		}
	}
}
