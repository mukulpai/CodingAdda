package problemset;

import java.util.Scanner;

public class LongWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			String s = in.next();

			if (s.length() > 10) {
				StringBuilder s1 = new StringBuilder();
				s1.append(s.charAt(0)).append(s.length() - 2).append(s.charAt(s.length() - 1));
				System.out.println(s1.toString());
			} else {
				System.out.println(s);
			}
		}
		in.close();
	}
}
