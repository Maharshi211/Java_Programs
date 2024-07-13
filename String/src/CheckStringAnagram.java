import java.lang.System;
import java.util.Arrays;

public class CheckStringAnagram {

	static boolean Anagram(char[] s1, char[] s2) {
		int n1 = s1.length;
		int n2 = s2.length;

		if (n1 != n2)
			return false;

		Arrays.sort(s1);
		Arrays.sort(s2);

		for (int i = 0; i < n1; i++)
			if (s1[i] != s2[i])
				return false;

		return true;

	}

	public static void main(String[] args) {

//		char s1[] = { 'e', 'r', 't', 'y' };
//		char s2[] = { 'r', 'y', 't', 'e' };
		
		char s1[] = "geeksforgeeks".toCharArray();
        char s2[] = "forgeeksgeeks".toCharArray();

		if (Anagram(s1, s2))
			System.out.println("The two strings are " + Arrays.toString(s1)+" "+Arrays.toString(s2)+" anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");

	}

}
