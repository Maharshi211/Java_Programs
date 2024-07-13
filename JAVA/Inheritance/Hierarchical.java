//package Inheritance;

class o {
	void one() {
		System.out.println("One   : [1]");
		
	}
}

class t extends o {
	void two() {
		System.out.println("Two   : [2]");

	}
}

class th extends o {
	void threr() {
		System.out.println("Three : [3]");
		
		this.one();
//		this.twr();
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		th u = new th();
		u.threr();
		System.out.println("feu");
		u.one();
	}

}
