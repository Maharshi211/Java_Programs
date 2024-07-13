package Sort;

import java.util.Arrays;

public class Bubblesort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 9, 2, 4, 8 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+ " ");
		}

		System.out.println(Arrays.toString(a));

	}

}
