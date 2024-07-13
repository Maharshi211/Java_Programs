package Varaibles;

class A {

	void t() {
		System.out.println("4 Hello [k]");
	}

	void k() {
		System.out.println("3 Hello [k]");
		this.n();
	}

	A() {
		this(8);
		System.out.println("Hekol");
	}

	A(int x) {
		
		System.out.println(x*x);
	}

	void n() {
		System.out.println("2 Hello [n]");
		this.t();
	}
}

public class thisswap {
	public static void main(String[] args) {
		A a = new A();
		A b = new A();
		b.k();

	}

}