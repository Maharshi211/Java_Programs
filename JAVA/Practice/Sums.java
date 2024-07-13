package Practice;

import java.util.Scanner;

public class Sums {

//	private long x,y;
//	private long sum;

	public static long Addsum(double d,double e) {
		long s=0;
		s = (long) (d+e);
		System.out.println("Sum is: "+s);
		return s;
	}


	public static void main(String[] args) {
		int n1,n2;
		Scanner sc = new Scanner(System.in);

		System.out.print("N1: ");
		n1 = sc.nextInt();
		System.out.print("N2: ");
		n2 = sc.nextInt();

		Addsum(n1,n2);


	}


	public boolean Sums(double average) {
		// TODO Auto-generated method stub
		return false;
	}

}
