package Array;

import java.util.Arrays;
import java.util.Scanner;

// jdk 17 LTS
class Array {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// int [] a = {1,2,3,4,5,6,7,8,9,10,21,23,34,54};
		int n=0;
		System.out.println("Enter Number How Much Array you Have to print Array: ");
		
		n = s.nextInt();
		int[] a = new int[n];
		

		System.out.println(" array print value : ");

		// m = s.nextInt();
		// System.out.print("How Many array used : ");
		// n = s.nextInt();
		// System.out.println("Enter element of array : ");
		// for(int i=0;i<a.length;i++){
		// System.out.println("Index is "+i+" Value is " + a[i]);
		// }

		for (int i = 0; i < a.length; i++) {
			// System.out.println("Index is "+i+" Value is " + a[i]);
			System.out.print(" Array is: a[" + i + "] = ");
			a[i] = s.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
//			System.out.println("Index of a[" + i + "] Value is " + a[i]);
			System.out.println("a["+i+"] = "+a[i]);
		}
		System.out.println(Arrays.toString(a));
	}
}