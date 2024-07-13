package Methodoverriding;

public class Morr3 extends Morr{

	public void child() {
		System.out.println("Child classs ....");
	}


	@Override
	public void method2() {
		int i = 990;
		System.out.println("Method 2222.."+i);
	}
	public static void main(String[] args) {
		Morr3 mr = new Morr3();
		mr.child();
		mr.myMethod();
		mr.method2();

		System.out.println("-------------------");
		Morr m1 = new Morr3();
		m1.method2();
		
		Morr m5 = new Morr();
		m5.method2();

	}


}
