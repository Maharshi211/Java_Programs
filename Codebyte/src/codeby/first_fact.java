package codeby;

import java.util.*;
import java.io.*;

class first_fact {
	public int FirstFactorial(int num) {
		if (num != 1) {
			return num * FirstFactorial(num - 1);
		}
		return num;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		first_fact c = new first_fact();
		System.out.println("Enter number");
//		System.out.println(c.FirstFactorial(s.nextLine()));
    System.out.println(c.FirstFactorial(4));
	}

}