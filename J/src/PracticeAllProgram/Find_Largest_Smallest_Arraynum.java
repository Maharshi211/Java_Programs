package PracticeAllProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Largest_Smallest_Arraynum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("Enter Arr element: ");
		n = sc.nextInt();

		int[] a = new int[n];
		int max, min;
		int i = 0;
//		for (i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//		}

		for (i = 0; i < n; i++) {
			a[i] = (int)(Math.random() * 10);
		}
		System.out.println(Arrays.toString(a));

		max = a[0];
		min = a[0];

		for (i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("MAX: " + max);
		System.out.println("MIN: " + min);

	}

}
