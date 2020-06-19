package com.hackerrank.algorithms.implementation;

import java.util.*;

public class PickingNumbers {

	public static int pickingNumbers(List<Integer> a) {

		int[] count = new int[a.size() - 1];

		for (int i = 0; i < a.size() - 1; i++) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(a.get(i));
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(j) - a.get(i) <= 1) {
					arr.add(a.get(j));
				}
			}
			count[i] = arr.size();

		}
		Arrays.sort(count);

		// Write your code here
		return count[count.length - 1];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			list.add(in.nextInt());
		}
		Collections.sort(list);

		System.out.println(PickingNumbers.pickingNumbers(list));
		in.close();
	}

}
