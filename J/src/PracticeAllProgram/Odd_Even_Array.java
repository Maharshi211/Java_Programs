package PracticeAllProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Odd_Even_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int i = 0, temp;
		int ctr = 0, sum = 0;

		System.out.print("Enter Array Size: ");
		n = sc.nextInt();

		int[] a = new int[n];
		System.out.println("Array Size is a["+n+"]");

		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = (int)(Math.random() * 10);
			System.out.println(a[i]+" ");
		}

		System.out.print("Array is a[] = ");
		System.out.println(Arrays.toString(a));
		System.out.println();

//		Even
		System.out.print("[");
		for (int e : a) {
			if (e % 2 == 0) {
				System.out.print(e + ", ");
				ctr++;
				sum += e;
			}
		}
		System.out.print("Even]:[Total Element][" + ctr + "] " + "Sum of Even [" + sum + "]");

		System.out.println();
//		Odd
		sum = 0;
		System.out.print("[");
		for (int e : a) {
			if (e % 2 == 1) {
				System.out.print(e + ", ");
				sum += e;
			}
		}
		System.out.println("Odd]:[Total Element][" + (a.length - ctr) + "] " + "Sum of Odd [" + sum + "]");

	}

}
