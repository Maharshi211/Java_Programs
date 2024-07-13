package Array;

import java.util.Arrays;
//import java.util.Iterator;
import java.util.Scanner;

public class Acendesend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int n = 0;

//		System.out.print("Enter Total elements of Array: ");
//		n = sc.nextInt();

//		int[] a = new int[n];

//		int[] a = new int[5];
		int[] a = { 32, 81, 58, 91, 0 };
		int n = 5;
//		for (int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//
//		}
//		System.out.print("a = ");
//		System.out.println(Arrays.toString(a));

//		a[0] = 32; a[1] = 81; a[2] = 58; a[3] = 91; a[4] = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		int i, j, temp;
		// System.out.println("Please Enter Number in the Array");
		System.out.println();
		// for (i = 0; i < n; i++) {
		// System.out.printf("Enter Array index value a[%d] = ",i);
		// a[i] = sc.nextInt();
		// }
		System.out.println();

		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
//					System.out.println(temp + " " + a[i] + " " + a[j]);
				}
			}
		}

		System.out.println("Sorted Array in Increasing Order: ");

		for (j = 0; j < 5; j++) {
//			 System.out.println(a[j]+" '");
		}
		System.out.println();

		System.out.println("Acending(a>b): " + Arrays.toString(a));
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {

					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
//					System.out.println(temp + " " + a[i] + " " + a[j]);
				}
			}
		}
		System.out.println();

		System.out.println("Sorted Array in Decreasing Order: ");
		System.out.println();

		for (j = 0; j < 5; j++) {
			// System.out.println(a[j]);
		}
		System.out.println("Decending: " + Arrays.toString(a));
		System.out.println();

	}
}
