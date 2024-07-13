package PracticeAllProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Second_element_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("Enter Total elements of Array: ");
		n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("a = ");
		System.out.println(Arrays.toString(a));

//		int[] a = { 70, 40, 10, 74, 42, 02, 30 };

		int i, j, t;

		for (i = 0; i < a.length; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}

		System.out.println(Arrays.toString(a));

//		int size = a.length;
//		int temp = size - 2;
//		
//		System.out.println(a[temp]);
		int x = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i + 2] != 0) {
				x = a[i + 2];
				break;
			}
		}
		System.out.print(x);
//		System.out.println(Arrays.toString(a));

	}

}
