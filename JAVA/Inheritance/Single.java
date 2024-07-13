//package Inheritance;

import java.util.Scanner;

class solar {
	void System() {
		

		int s;
		s = 10;
		System.out.println("Enter total planet: " + s);

	}
}

class Animal extends solar {
	void Dog() {
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		s1 = "Dog is ";
		s2 = sc.next();
		s3 = sc.next();

		System.out.println(s1 + " " + s2 + " " + s3);

	}
}

public class Single {

	public static void main(String[] args) {

		Animal d = new Animal();

		d.System();
		d.Dog();

	}

}
