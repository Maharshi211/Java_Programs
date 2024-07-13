package PracticeAllProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Two_Array_merge_Even_Odd_Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n;

		System.out.print("Enter 1st Array Size: ");
		m = sc.nextInt();
		System.out.print("Enter 2nd Array Size: ");
		n = sc.nextInt();

		int add = 0;
		int div = 0;
		add = m + n;
		div = add / 2;
		int x = 0;

		int[] a = new int[m];
		int[] b = new int[n];

		int[] c = new int[add];

		System.out.println("Enter 1st Array Element: ");

		for (int i = 0; i < m; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter 2nd Array Element: ");

		for (int i = 0; i < n; i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				c[x] = a[i];
				x++;
			}
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				c[x] = b[i];
				x++;
			}
		}

		System.out.print("a[] = ");
		System.out.println(Arrays.toString(a));
		System.out.print("b[] = ");
		System.out.println(Arrays.toString(b));

		System.out.println("new merge array is: ");

		System.out.print("c[] = [");
		for (int i = 0; i < x; i++) {
			if (c[i] % 2 == 0) {
				if (c[i] != 0) {
					System.out.print(+c[i] + ", ");
				}
			}
		}

		System.out.println("Even]");

//		int[] k = new int[c.length];
//		for(int i=0; i<c.length; i++) {
//			k[i]=c[i];
//		}
//		
//		System.out.print("fodfoijoewjgiur");
//		System.out.print(Arrays.toString(k));
//		System.out.println(2);

		for (int i = 0; i < c.length; i++) {
			System.out.println("c[" + i + "] = " + c[i]);
		}

		System.out.println("X is " + x);

//		Problem, zero is not removing
		System.out.println("New Ara.............................");
		int k1 = c.length - x;
		int[] y = new int[k1];

		for (int i = 0; i < c.length; i++) {
			y[i] = c[i];
		}
		System.out.println("Y is : ");

		System.out.println(Arrays.toString(y));
	}

}
