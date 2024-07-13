import java.lang.System;
public class StringPalindromeTwoPointer {

	public static boolean isPalindrome(String sr) {
		int i = 0, j = sr.length() - 1;

		while (i < j) {
			if (sr.charAt(i) != sr.charAt(j)) {
				return false;
			}

			i++;
			j--;
		}
		return true;

	}

	public static void main(String[] args) {
		String sr = "Radar";

		sr = sr.toLowerCase();
		boolean bool;
		bool = isPalindrome(sr);
		System.out.println("bool: " + bool);

		if (isPalindrome(sr)) {
			System.out.println("Yes,this '" + sr + "' String is Palindrome.");
		} else {
			System.out.println("No, String is Not Palindrome.");
		}

	}
}