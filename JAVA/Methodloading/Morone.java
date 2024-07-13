package Methodloading;

public class Morone {

	public void ormo(int a) { // First_Concept === Parameters with different data types
		System.out.print(a);

	}

	public void ormt(String a) {
		System.out.println(a);

	}

	public static void main(String[] args) {
		Morone ob = new Morone();

		ob.ormt(" Maharshi");
		ob.ormo(230);

	}

}
