import java.lang.System; 
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter Your String: ");
		// String s1 = sc.nextLine();
		String s1 = "sneha panchal";
		String s3 = "Maharshi";
		String s2 = new String();

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}

		StringBuilder s = new StringBuilder(s3);

		System.out.println("With    Built-in Func: " + s2);
		System.out.println("Without Built-in Func: " + s.reverse().toString());

	}
}
