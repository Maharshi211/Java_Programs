package PracticeAllProgram;

import java.util.Arrays;

public class Copy_One_arr_to_Another {

	public static void Copy_Array() {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = a; // copying arrays

		for (int m : b) {
			System.out.print("");
		}
		System.out.print("b = ");
		System.out.println(Arrays.toString(b));
	}

	public static void main(String[] args) {

//		CA ob = new CA();
		Copy_Array();

		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = new int[x.length];
		int sum = 0, i = 0;

		for (i = 0; i < x.length; i++) {
			y[i] = x[i];
		}

//		System.out.print("y[] = ");
		for (i = 0; i < y.length; i++) {
//			System.out.print(y[i]+" ");

		}
		System.out.print("X = ");
		System.out.println(Arrays.toString(x));
		System.out.print("Y = ");
		System.out.println(Arrays.toString(y));

	}

}
