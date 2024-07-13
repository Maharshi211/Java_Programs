package PracticeAllProgram;

import java.util.Arrays;

public class Remove_Dupllicate_Element_array {
	public static void main(String[] args) {
		int a[] = { 99, 10, 10, 20, 20, 30 };
//		for(int i=0; i<5; i++) {
//			int a[] = { (int)(Math.random() * 10) };
//		}
		int n = a.length;
		System.out.println(n);
		System.out.println("After Remove Duplicate Array Element..");
		n = removeduplicates(a, n);
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.println(n);
	}

	public static int removeduplicates(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				System.out.println("before" + "::" + a[i]);

				temp[j++] = a[i];
				System.out.println("after" + "::" + a[i]);
			}
		}

		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) {
			a[i] = temp[i];
		}

		return j;
	}

}
