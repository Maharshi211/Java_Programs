package Practice;

public class Fibonacci {

	public static void main(String[] args) {

		int x = 0, y = 1, c, i, count = 20;

		System.out.print	(x + " " + y);

		for (x = 2; x < count; x++) {
			c = x + y;
			System.out.print(" " + c);
			x = y;
			y = c;

		}

	}

}
