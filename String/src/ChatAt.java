import java.lang.System;

public class ChatAt {

	public static void main(String[] args) {
		String x1 = "Maharshi";
		String x2 = "Maharshi";
		System.out.println("String r equal or not: " + x1.equals(x2));
		System.out.println(x1.equalsIgnoreCase(x2));

		char ch = x1.charAt(4);
		System.out.println(ch);
		char s2 = x1.charAt(7);
		System.out.println(s2);
		int i = 0;

		System.out.println();
		for (i = 0; i < x1.length(); i++) {
			System.out.print(x1.charAt(i) + " ");

		}

	}

}
