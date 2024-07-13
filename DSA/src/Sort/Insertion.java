package Sort;

public class Insertion {

	public static void main(String[] args) {

		int[] x = { 20, 50, 10, 70, 30 };

		int n = x.length;

		for (int i = 1; i < n; i++) {

			int key = x[i];
			int j = i - 1;

			while (j >= 0 && x[j] > key) {
				x[j + 1] = x[j];
				j = j - 1;

			}

			x[j + 1] = key;

		}

		for (int i = 0; i < n; ++i)
			System.out.print(x[i] + " ");

	}

}
