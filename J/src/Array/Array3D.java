package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Array3D {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int i, j, row, col;

		System.out.println("Enter The RowS: ");
		row = sc.nextInt();
		System.out.println("Enter The ColS: ");
		col = sc.nextInt();

		int[][] x = new int[row][col];

		System.out.println("Enter the elements of the matrix");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				x[i][j] = sc.nextInt();
			}
		}

		System.out.println("The elements of the matrix");
		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {
				System.out.print(x[i][j] + " | ");
			}
			System.out.println();
		}
		int sum = 0;

		for (i = 0; i < row; i++) {
			for (j = 0; j < col; j++) {

				if (i == j) {
					sum += x[i][j];
				}
			}
		}
		System.out.println(sum);

		int first_row = 0;
		int last_row = row - 1;
		int first_column = 0;
		int last_column = col - 1;

		System.out.println("The Output of the given matrix in spiral order: ");
		int count = 0;

		while ((first_row <= last_row) && (first_column <= last_column)) {
			for (i = first_column; i <= last_column; i++) {
				if (count < row * col) {
					count++;

					System.out.print(x[first_row][i] + " ");

				}
			}

			for (i = first_row + 1; i <= last_row; i++) {
				if (count < row * col) {
					count++;

					System.out.print(x[i][last_column] + " ");

				}
			}

			for (i = last_column - 1; i >= first_column; i--) {
				if (count < row * col) {
					count++;

					System.out.print(x[last_row][i] + " ");

				}
			}

			for (i = last_row - 1; i > first_row; i--) {
				if (count < row * col) {
					count++;

					System.out.print(x[i][first_column] + " ");

				}
			}

			first_row++;
			first_column++;
			last_row--;
			last_column--;
		}
		
		System.out.println();
		System.out.println(count);

	}

}
