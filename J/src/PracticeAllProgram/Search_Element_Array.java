package PracticeAllProgram;

import java.util.Scanner;

public class Search_Element_Array {
	
	public static void Serach() {
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n, i = 0;
		System.out.println("Size of Array: ");
		n = sc.nextInt();

		int[] a = new int[n];

		System.out.println("Enter array element:");

		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}

		System.out.print("Enter the Search Array Element :");

		int s = sc.nextInt();
		int f = 0;

		for (i = 0; i < n; i++) {
			if (a[i] == s) {
				f = 1;
				break;
			}
		}

		if (f == 1) {
			System.out.printf("The Element is found in the position : %d", i + 1);
			System.out.printf("\nThe Element is found in the index : %d", i);
		} else {
			System.out.println("The Element is Not found");
		}

	}

}
