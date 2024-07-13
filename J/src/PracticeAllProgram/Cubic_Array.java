package PracticeAllProgram;

import java.util.Arrays;

public class Cubic_Array {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int cube = 0, temp;
		int i;
		for (i = 0; i < a.length; i++) {
			cube = a[i] * a[i] * a[i];
			System.out.println(cube);
			System.out.println();
			
			temp = cube;
			cube = a[i];
			a[i] = temp;

		}
		System.out.println(Arrays.toString(a));

	}

}
