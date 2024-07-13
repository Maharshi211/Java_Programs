package PracticeAllProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Two_array_merge_third {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;
		System.out.print("Enter 1st Array Size: ");
		m = sc.nextInt();
		System.out.print("Enter 2nd Array Size: ");
		n = sc.nextInt();

		int mul = 0;
		mul = m + n;
		int x = 0;

		int[] a = new int[m];
		int[] b = new int[n];

		int[] c = new int[mul];

		System.out.println("Enter 1st Array Element: ");

		for (int i = 0; i < m; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter 2nd Array Element: ");

		for (int i = 0; i < n; i++) {
			System.out.print("b["+i+"] = ");
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			c[x] = a[i];
			x++;
		}
		

		for (int i = 0; i < b.length; i++) {
			c[x] = b[i];
			x++;
		}

		System.out.print("a[] = ");
		System.out.println(Arrays.toString(a));
		System.out.print("b[] = ");
		System.out.println(Arrays.toString(b));

		System.out.println("new merge array is: ");

		for (int i = 0; i < x; i++) {
			System.out.print("");
		}

		System.out.print("c[] = ");
		System.out.println(Arrays.toString(c));
		System.out.println("X is " + x);

	}

}
