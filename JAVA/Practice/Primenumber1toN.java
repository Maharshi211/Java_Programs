package Practice;

import java.util.Scanner;

public class Primenumber1toN {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n value: ");
		n = sc.nextInt();
		int i = 0;
		int num = 0;

		String primeNumbers = "";

		for (i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}

}
