package Practice;

public class Palindrome {

	public static void main(String[] args) {
		int rim, sum=0, temp;
		int n = 213321;
		
		temp = n;
		while(n>0) {
			rim = n%10;
			sum = (sum*10) + rim;
			n = n/10;
		}
		
		if (temp == sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		

	}

}
