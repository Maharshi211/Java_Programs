package Constructor;

public class Parameterized {
	// creating a para constructor
	int id;
	String name;

	Parameterized(int i, String n) {
		id = i;
		name = n;
	}

	void display1() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		Parameterized c = new Parameterized(13, "Ethan"), c1  = new Parameterized(24, "denrock");

		c.display1();
		c1.display1();

	}

}
