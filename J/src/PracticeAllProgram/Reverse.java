package PracticeAllProgram;
import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int[] x = {1,2,4};
		
		for(int i=x.length-1; i>=0; i--) {
			//System.out.println(x[i]);
		}
		
		int num  = 1996;
		int rev = 0;
		int rem = 0;
		
		while(num!=0) {
			rem = num%10;
			System.out.println("rem "+rem);
			rev = rev*10 + rem;
			System.out.println("rev "+rev);
			num = num/10;
			System.out.println("num "+num);
			System.out.println();
		}
		
		System.out.println(rev);
	}

}
