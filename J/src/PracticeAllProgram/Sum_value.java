package PracticeAllProgram;

public class Sum_value {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0, i = 0;

		for (i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);

		int[] b = { 1, 2, 3, 4, 5 };
		sum = 0;
		for (int e : b) {
			sum = sum + e;

		}

		System.out.println(sum);

		float avg;
		avg = sum / b.length;
		System.out.println(avg);

	}

}
