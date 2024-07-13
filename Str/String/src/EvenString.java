import java.lang.System;
public class EvenString {
	public static void printword(String s) {

		String[] words = s.split(" ");

		int[] wordlengths = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			wordlengths[i] = words[i].length();

		}
		for (int i = 0; i < words.length; i++) {
			if (wordlengths[i] % 2 == 0) {
				System.out.println(words[i]);
			}
		}

	}

	public static void main(String[] args) {

		String s = "12rjig 34ef 56grth 7dew89";
		printword(s);

	}

}
