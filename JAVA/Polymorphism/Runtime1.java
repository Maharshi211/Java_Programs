package Polymorphism;



public class Runtime1 extends Runtime{
	// @Override
	
	public void method() {
		System.out.println("I am a method from Child Class.");
	}

	public static void main(String args[]) {
		Runtime ob = new Runtime1();
		ob.method();
		
		Runtime a;
		a = new Runtime();
		a.method();
		
		
	}



}


