package String;

public class ReverseString {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Maharshi "); // Method_one
		System.out.println(a.reverse());

		String input = "Maharshi"; // Method_two
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1 = input1.reverse();
		for (int i = 0; i < input1.length(); i++)
			System.out.print(input1.charAt(i));

	}

}
