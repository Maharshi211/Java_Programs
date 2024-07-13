package Sort;

public class Bubble {

	public static void main(String[] args) {

		int[] x = { 40, 80, 10, 50, 20 };

		int n = x.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
 
				if (x[j - 1] > x[j]) {
					temp = x[j-1];
					x[j-1] = x[j];
					x[j] = temp;
				}

			}

		}
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}

	}

}
