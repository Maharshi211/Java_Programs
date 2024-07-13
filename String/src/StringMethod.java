import java.util.Arrays;
import java.lang.System;
public class StringMethod {

	public static void main(String[] args) {

//		Spliterator method

		String s1 = new String("Maharshi Panchal");

		String[] s2 = s1.split("\\.");
		System.out.println();
		System.out.println(Arrays.toString(s2));

//		Uppercase() & Lowercase() Method

		String s3 = "Maharshi";
		System.out.println("Lowercase String: " + s3.toLowerCase());
		System.out.println("Uppercase String: " + s3.toUpperCase());

//		trim() Method

		String s4 = "     Hello All of You, I'm Maharshi Panchal , Maharshi!";
		System.out.println(s4.trim());

//		startsWith() and endsWith() method

		String s5 = "Maharshi";
		System.out.println(s5.startsWith("M"));
		System.out.println(s5.startsWith("Mh"));
		System.out.println(s5.endsWith("i"));
		System.out.println(s5.endsWith("ia"));
		System.out.println(s4.length());

		String a = "American";
		String b = a.intern();
		System.out.println(b);

		String re = s4.replace("Maharshi", "Marcus");
		System.out.println(re);

	}

}
