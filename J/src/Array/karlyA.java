package Array;

import java.util.Arrays;
import java.util.Scanner;

public class karlyA {
	
	public void as(int b[]) {
		String r = "[";
		for (int j = 0; j < b.length; j++) {
			if (j > 0) {
				r = r + ", ";
			}
			r = r + b[j];

		}
		r += "]";
		System.out.println(r);
//		System.out.println(b.length);
		
	}
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
		karlyA n = new karlyA();

//		int n;
//		System.out.print("Enter n ");
//		n = sc.nextInt();

		int i;
//		int[] b = new int[n];
		int[] x = { 1, 2,32,'3', 3, 4, 5 };
		n.as(x);
		System.out.println();
		
		
		

//		for (int j = 0; j < b.length; j++) {
//			System.out.print("Array is: b[" + j + "] = ");
//			b[j] = sc.nextInt();
//		}

		
	}

}
