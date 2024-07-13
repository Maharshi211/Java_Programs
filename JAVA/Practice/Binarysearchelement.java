package Practice;

public class Binarysearchelement {

	public static void main(String[] args) {

		int x[] = { 21, 43, 64, 86, 20, 01 };
		int key = 20;
		int l = 0;
		int h = x.length - 1;

		boolean flag = false;

		while (l <= h) {
			int temp, i, j;
			for (i = 0; i < x.length; i++) {
				for (j = i + 1; j < x.length; j++) {

					if (x[i] < x[j]) {

						temp = x[i];
						x[i] = x[j];
						x[j] = temp;
					}

				}

			}

			int m = (1+h)/2;
//			if( == key) {
//				flag = true;

			}

		}

	}


