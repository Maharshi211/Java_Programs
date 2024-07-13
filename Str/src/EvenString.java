

public class EvenString {
	public static void printword(String s) {

		for (String word : s.split(" "))
			if (word.length() % 2 == 0)
				System.out.println(word);

	}

	public static void main(String[] args) {

		String s = "I m  Maharshi Panchals NO I m Not Humans";

		printword(s);

	}

}
