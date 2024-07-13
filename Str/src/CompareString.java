
public class CompareString {

	public static void main(String[] args) {

		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = new String("ABC");
		String s4 = "DEFG";

//		By Using equals() Method

		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equals(s2));

//		By Using == Operator
		System.out.println();

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

//		By compareTo() Method
		System.out.println();

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s4.compareTo(s1));

	}

}
