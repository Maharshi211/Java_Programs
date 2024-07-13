
public class Stringins {
	public static String sis(String os, String is, int index) {

		String s1 = new String();

		for (int i = 0; i < os.length(); i++) {
			s1 += os.charAt(i);

			if(i == index) {
				s1 += is;
			}
		}

		return s1;

	}

	public static void main(String[] args) {
		String os = "Mai";
		String is = "harsh";
		int index = 1;

		System.out.println("Original String: " + os + "Inserted String: " + is);

		System.out.println("Modified String: " + sis(os, is, index));

	}

}
