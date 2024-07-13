import java.lang.System;
public class ConcatinationString {

	public static void main(String[] args) {

		String s1 = "xyz";
		String s2 = "mnpo";
		String s3;

		System.out.println(s3 = s1 + s2);
		System.out.println(s3 = s1.concat(s2));

		String s = (new StringBuilder()).append("Sachin").append(" Tendulkar").toString();
		System.out.println(s);

//		String concatenation using StringBuilder class
		StringBuilder s4 = new StringBuilder("New World");
		StringBuilder s5 = new StringBuilder(" Welcome");

		StringBuilder s0 = s4.append(s5);
		System.out.println(s0.toString());

	}

}
