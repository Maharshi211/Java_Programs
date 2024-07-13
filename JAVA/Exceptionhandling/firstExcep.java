package Exceptionhandling;

public class firstExcep {

	public static void main(String[] args) {
		int i=0;
		for (i=0; i<10; i++) {
			
			System.out.println(i);
			if (i==7) {
				System.out.println("nOt Execute");
				System.out.println(7/0);
			}
//			System.out.println(i);
		}

	}

}
