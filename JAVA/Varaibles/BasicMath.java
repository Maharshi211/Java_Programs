package Varaibles;

class Math {
	int x;
	int y;

	void insert(int a, int b) {
		x = a;
		y = b;
	}

	void add() {
		System.out.println((x + y));
	}

	void mul() {
		System.out.println((x * y));
	}

	void div() {
		System.out.println((x / y));
	}

	void sub() {
		System.out.println((x - y));
	}

}

public class BasicMath {

	public static void main(String[] args) {

		Math m = new Math();

		m.insert(5, 7);
		m.add();
		m.mul();
		m.sub();
		m.div();

	}

}
