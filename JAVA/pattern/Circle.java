package pattern;

public class Circle {

	public static void main(String[] args) {
		int i, j;

		int n = 0;
		int m = 0;

		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
				n++;
			}

			System.out.println();
		}
		System.out.println("two");
		

		for (i = 5; i >= 1; i--) {
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		for (i = 1; i <= 5; i++) {
//			for (j = 5; j <= i; j--) {
//				System.out.print("* ");
//				n++;
//			}
//
//			System.out.println();
//		}
		
		

	}

}
