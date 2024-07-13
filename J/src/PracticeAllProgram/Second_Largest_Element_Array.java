package PracticeAllProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Largest_Element_Array {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n;
//		System.out.print("Size of Array: ");
//		n = sc.nextInt();

//		int[] a = new int[n];
		int[] a = { 21, 43, 64, 76, 32, 23, 65, 64, 77 };
		int temp;

//		for (int i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//		}
		System.out.println("a[] = "+Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("dcending: "+Arrays.toString(a));
		int max = a[0];
		int min = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("MAX: "+max);
		System.out.println("MIN: "+min);
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.println("dcending SL: " + a[i + 1]);
				break;
			}
		}
		System.out.println();
		
		

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Acending: "+Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("MAX: "+max);
		System.out.println("MIN: "+min);
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				System.out.println("Aecending SL: " + a[a.length - 2]);
				break;
			}
		}

	}

}
