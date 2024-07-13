package PracticeAllProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Common_Element_in_Two_Array {

	@SuppressWarnings("null")
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		int[] a = { 1, 2, 2, 0, 5 };
		int[] b = { 2, 1, 5, 6, 7 };
		int[] c = new int[a.length + b.length];
		int x = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
           
				if (a[i] == b[j]) {
					System.out.print(" " + a[i]);

				}

			}
		}

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			x++;              
		}
		System.out.println();
		System.out.print("c[] = [");
		for (int i = 0; i < x; i++) {
			System.out.print(c[i] + ", ");
		}
		System.out.println("Common]");
		System.out.println(c.length);
//		System.out.println(Arrays.toString(c));
	}
}
