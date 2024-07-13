package Methodloading;

public class Morsec {		//Parameters with different sequence of a data types

	public void ormo(int a , String b) { //	Second_Concept === Parameters with different data types
		System.out.print(a);
		System.out.print(b);


	}
	public void ormt(String a, int b) {
		System.out.print(a);
		System.out.print(b);

	}

	public static void main(String[] args) {

		Morsec  ob1 = new Morsec();

		ob1.ormo(77, " one ");
		ob1.ormt(" two ", 340);

	}

}
