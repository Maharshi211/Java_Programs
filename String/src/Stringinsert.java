import java.lang.System;


public class Stringinsert {

	public static void main(String[] args) {
		String s1 = "Bht";
		// original string

		String s2 = "ara";
		// insert string

		String n1 = new String();
		// new string store new data

		int index = 1; //index 1 after insert string

		for (int i = 0; i < s1.length(); i++) {

			n1 = n1 + s1.charAt(i);
			System.out.println(n1);

			if (i == index) {
				n1 = n1 + s2;
			}
		}
		
		System.out.println(n1);

	}

}
