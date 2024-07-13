package String;

public class EvenString {
	public static void printword(String s) {

		for (String word : s.split(" "))
			if (word.length() % 2 == 0)
				System.out.println(word);

	}

	public static void main(String[] args) {

		String s = "one two three four five six seven";

		printword(s);
		System.out.println(s.length());

	}

}
