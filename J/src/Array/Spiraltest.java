package Array;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Spiraltest {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int i, j, r, c;
		// int i,j;
		// int r=3;
		// int c=3;

		System.out.print("Enter ROWS: ");
		r = sc.nextInt();
		System.out.print("Enter COLS: ");
		c = sc.nextInt();

		int[][] x = new int[r][c];
		if (r <= 0) {
			System.out.println("rows invalid.");
		} else if (c <= 0) {
			System.out.println("columns invalid.");
		} else {
			System.out.println("Enter the matrix Values: ");

			// int [][]x = {{1,2,3},{4,5,6},{7,8,9}};

			// for(i=0; i<r; i++){
			// for(j=0; j<c; j++){
			// x[i][j] = sc.nextInt();
			// }
			// }

			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					x[i][j] = (int) (Math.random() * 9);
					System.out.print(x[i][j] + " | ");
				}
				System.out.println();
			}

			System.out.println("The Output of the given matrix in spiral order: ");
			int count = 0;

			int first_row = 0;
			int last_row = r - 1;
			int first_column = 0;
			int last_column = c - 1;

			while ((first_row <= last_row) && (first_column <= last_column)) {

				for (i = first_column; i <= last_column; i++) {
					if (count < r * c) {
						count++;
						System.out.print(x[first_row][i] + " ");
					}
				}

				for (i = first_row + 1; i <= last_row; i++) {
					if (count < r * c) {
						count++;
						System.out.print(x[i][last_column] + " ");
					}
				}

				for (i = last_column - 1; i >= first_column; i--) {
					if (count < r * c) {
						count++;
						System.out.print(x[last_row][i] + " ");
					}
				}

				for (i = last_row - 1; i > first_row; i--) {
					if (count < r * c) {
						count++;
						System.out.print(x[i][first_column] + " ");
					}
				}

				first_row++;
				first_column++;
				last_row--;
				last_column--;
			}

		}
	}

}
