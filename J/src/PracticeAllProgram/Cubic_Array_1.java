package PracticeAllProgram;

import java.util.Scanner;

public class Cubic_Array_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0, sum = 0;
		System.out.print("Enter size of arr: ");
		n = sc.nextInt();

		int[] a = new int[n];
//		for(int i=0; i<n; i++) {
//			a[i] = sc.nextInt();
//		}

		for (int i = 0; i < n; i++) {
			a[i] = (int) (Math.random() * 10);
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.print("Square of Number: ");
		for (int s : a) {
			System.out.print(s * s + " '");
		}
		System.out.println();

		System.out.print("Cube of Number: ");
		for (int N : a) {
			System.out.print(N * N * N + "' ");
		}
		System.out.println();
		// sum of Cubic_Array array

//		for(int N:a) {
//			sum += (N*N*N);
//		}
//		System.out.println("Sum of Cubic Array: "+sum);

	}

}
