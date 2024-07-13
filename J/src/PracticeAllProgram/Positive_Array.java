package PracticeAllProgram;

import java.util.Scanner;

public class Positive_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i = 0;
		int sum = 0;
		System.out.print("Enetr Size of array: ");
		n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("Enter Array Element: ");

		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();

		}

		System.out.print("Positive Number: ");
		for (int e : a) {
			if (e > 0) {
				System.out.print(e + " ");
				sum += e;
			}
			
		}

		System.out.println();
		System.out.println("SUM: "+sum);

		System.out.print("Nagative Number: ");
		for (int e : a) {
			if (e < 0) {
				System.out.print(e + " ");
				sum += e;
			}
		}

	}

}
