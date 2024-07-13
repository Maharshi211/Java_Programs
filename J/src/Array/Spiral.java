package Array;

import java.util.*;
import java.io.*;

public class Spiral {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 1 2 3
		// 4 5 6
		// 7 8 9

		int m = 3; // number of rows
		int n = 3; // number of columns

		int first_row = 0;
		int last_row = m - 1;
		int first_column = 0;
		int last_column = n - 1;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("The Output of the given matrix in spiral order: ");
		int count = 0;

		while ((first_row <= last_row) && (first_column <= last_column)) {
			for (int i = first_column; i <= last_column; i++) {
				if (count < m * n) {
					count++;

					System.out.print(a[first_row][i] + " ");

				}
			}

			for (int i = first_row + 1; i <= last_row; i++) {
				if (count < m * n) {
					count++;
					System.out.print(a[i][last_column] + " ");

				}
			}

			for (int i = last_column - 1; i >= first_column; i--) {
				if (count < m * n) {
					count++;
					System.out.print(a[last_row][i] + " ");

				}
			}

			for (int i = last_row - 1; i > first_row; i--) {
				if (count < m * n) {
					count++;
					System.out.print(a[i][first_column] + " ");

				}
			}

			first_row++;
			first_column++;
			last_row--;
			last_column--;
		}

	}
}