package com.hackerrank.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int Q = in.nextInt();
		int lastanswer = 0;
//		int[] seqList = new int[N];

//		for (int i = 0; i < N; i++) {
//			ArrayList<Integer> s0 = new ArrayList<Integer>();
////			seqList[i] = s0;
//		}

		ArrayList<Integer> s0 = new ArrayList<Integer>();
		ArrayList<Integer> s1 = new ArrayList<Integer>();

		for (int i = 0; i < Q; i++) {
			int query = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			int index = ((x ^ lastanswer) % N);
			// append
			if (query == 1) {
				if (index == 0) {
					s0.add(y);
				} else {
					s1.add(y);
				}

			}
			// assign
			else if (query == 2) {
				if (index == 0) {
					int index1 = y % s0.size();
					lastanswer = s0.get(index1);
					System.out.println(lastanswer);
				} else {
					int index1 = y % s1.size();
					lastanswer = s1.get(index1);

					System.out.println(lastanswer);
				}
			}
			in.close();
		}
	}

}
