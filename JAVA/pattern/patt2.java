package pattern;
import java.util.Scanner;

public class patt2 {

	public static void main(String[] args) {

//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5


//		int x = 1;
		Scanner sc = new Scanner(System.in);

		int n;
		System.out.print("Enter number to print values ");
		n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
//				System.out.println(i+" ");
			}
			System.out.println();

		}








	}

}
