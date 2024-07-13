package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Userarray {
	public static void main(String[] args) {

		int[] num;

		Scanner sc = new Scanner(System.in);

		System.out.print("How many Integer Value Print : ");
		int n = 0;

		// if(sc.hasNextLine()){
		n = sc.nextInt();
		// }
		num = new int[n];
		System.out.println("Total Array is: " + n);

//        for(int i=0; i<n; i++){
//            System.out.printf("Enter Integer %d ",i);
//                if(sc.hasNextLine()){
//                    num[i]=sc.nextInt();
//                }
//
//        }
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter Integer %d ", i);
			if (sc.hasNextLine()) {
				num[i] = (int) (Math.random() * 20);
			}
			System.out.println();

		}
		System.out.println(Arrays.toString(num));
	}
}
