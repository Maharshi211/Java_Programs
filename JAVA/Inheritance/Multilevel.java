//package Inheritance;

import Varaibles.thisswap;

class onr {
	void one() {
		System.out.println("One   : [1]");
	}
}

class twr extends onr {
	void twr() {
		System.out.println("Two   : [2]");
		
	}
}

class threr extends twr {
	void threr() {
		System.out.println("Three : [3]");
		this.one();
		this.twr();
	}
}

public class Multilevel {

	public static void main(String[] args) {

		threr t = new threr();

		t.threr();
		t.twr();

	}

}
