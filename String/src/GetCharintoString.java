import java.lang.System;
import java.util.Scanner;

public class GetCharintoString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = "America";
		char d;
		int l = 0;
		int count = 0;

		do {
			System.out.println("Enter Find index of char");
			int n = sc.nextInt();
			for (int i = 0; i < s	.length(); i++) {

				if (i == n) {

					d = s.charAt(i);
					System.out.println("index of " + n + " char is " + d);
					count++;

				} else if (s.length() < n) {
					System.out.println("Please Enter Valid Index Number,It is out of range " + n + " " + s);
					System.out.print("\n");
					count++;
					break;
				}
//				System.out.println(count);
			}

//			if (count >= 5) {
//				System.out.println("if you Exit Press zero other wise press any number");
//				int m = sc.nextInt();
//				if (m == l) {
//					System.exit(0);
//					break;
//				}
//				count = 0;
//			}

			if (count >= 5) {
				System.out.println("You can Play 5 times Please you can Exit other wise i exit you ");
				int m = sc.nextInt();
				if (m >= 0) {
					System.exit(0);
					break;
				}
				count = 0;
			}
		} while (l == 0);
	}
}
