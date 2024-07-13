package Methodloading;


public class Morth {

	public void ormo(int a , String b) { //	Third_concept == Different number of parameters
		System.out.print(a);
		System.out.print(b);


	}
	public void ormt(String a, int b, boolean c) {
		System.out.print(a);
		System.out.println(b);
		System.out.println(c);

	}

	public static void main(String[] args) {
		Morth ob2 = new Morth();
		ob2.ormo(423, " Mahar");
		ob2.ormt("shi ", 9283, false);

		
		Morsec oby = new Morsec();
		
		oby.ormt("Morsec one ", 77);
		
	}

	

}
