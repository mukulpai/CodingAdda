package com.hackerrank.algorithms.implementation;

import java.io.IOException;
import java.util.Scanner;

public class DesignerPDF {
	// Complete the designerPdfViewer function below.
	static int designerPdfViewer(int[] h, String word) {
		char[] arr = word.toCharArray();
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int num = Integer.valueOf(arr[i]);
			if ((h[(num - 97) % 97]) > max) {
				max = h[(num - 97) % 97];
			}
		}
		return max * word.length();

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[] h = new int[26];

		String[] hItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 26; i++) {
			int hItem = Integer.parseInt(hItems[i]);
			h[i] = hItem;
		}

		String word = scanner.nextLine();

		int result = designerPdfViewer(h, word);
		System.out.println(result);
		scanner.close();
	}

}
