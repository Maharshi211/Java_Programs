package Constructor;

public class Default {
	// creating a Default constructor
	int id;
	String name;

	void display1() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		Default c = new Default();

		c.display1();

	}

}
