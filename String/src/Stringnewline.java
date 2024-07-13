import java.lang.System; 
public class Stringnewline {
	public static void main(String a[]) {

//		Using System.lineSeparator() method
		String new1 = System.lineSeparator();

		System.out.println("frsiuvnr" + new1 + "vrevb");

//		Using platform-dependent newline character

		System.out.println("frsiuvnr" + "\n" + "vrevb");

//		Using System.getProperty() method
		String newline = System.getProperty("line.separator");

		// Printing new line between two strings
		System.out.println("GFG" + newline + "gfg");

//		Using %n newline character

		System.out.printf("GFG%ngfg");

//		Using System.out.println() method 

		System.out.println("GFG");
		System.out.println("gfg");

	}
}
