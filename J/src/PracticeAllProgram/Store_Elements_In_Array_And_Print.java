package PracticeAllProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Store_Elements_In_Array_And_Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int n = 0;
		System.out.print("Enter Total Num of array element:");
		n = sc.nextInt();

		int[] a = new int[n];
		System.out.println();
		for (i = 0; i < n; i++) {
			System.out.print("Array a["+i+"] = ");
			a[i] = sc.nextInt();

		}
		System.out.println();
		for(i=0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		System.out.println();	
		for(int e:a) {
			System.out.print(" "+e);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(a));

	}

}
