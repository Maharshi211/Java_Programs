package dsa;

import java.util.Arrays;
import java.util.Scanner;

//Here this Program is Taken Too much time Complexity
public class Arraybetweeninsertvalue {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		int n, m, p;
		System.out.print("Enter Array Size: ");
		n = s.nextInt();

		int[] a = new int[n];
		int[] b = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println(Arrays.toString(a));

		System.out.print("Enter Index to be inserted value in array: ");
		m = s.nextInt();

		System.out.print("Enter new value in array: ");
		p = s.nextInt();

		for (int i = 0; i < n + 1; i++) {
			if (i < m) {
				b[i] = a[i];
			} else if (i == m) {
				b[i] = p;
			} else {
				b[i] = a[i - 1];
			}
		}

		System.out.print("Element are... ");
		System.out.println(Arrays.toString(b));

	}
}
