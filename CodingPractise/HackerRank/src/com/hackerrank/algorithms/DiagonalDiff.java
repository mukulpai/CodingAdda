package com.hackerrank.algorithms;

import java.util.Scanner;

/**
 * 
 * 00 01 02 10 11 12 20 21 22
 * 
 * @author MUKULPAI
 *
 */
public class DiagonalDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = row;
		int[][] arr = new int[row][col];
		int diag1 = 0;
		int diag2 = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == j) {
					diag1 = diag1 + arr[i][j];
				}
			}
		}
		for (int i = 0, j = row - 1; i < row; i++, j--) {
			diag2 = diag2 + arr[i][j];
		}
		System.out.println(Math.abs(diag1 - diag2));
		in.close();
	}
}
