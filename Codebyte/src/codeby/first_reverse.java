package codeby;

import java.lang.System;
import java.util.Scanner;

public class first_reverse {

	public static String FirstReverse(String s) {

		// Scanner sc = new Scanner(System.in);

		String s1 = new String();
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);
		}

		return s1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print(FirstReverse(sc.nextLine()));
	}

}
