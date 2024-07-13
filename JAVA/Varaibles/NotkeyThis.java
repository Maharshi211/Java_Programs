package Varaibles;

class Student {
	int rn;
	String name;
	float fees;

	Student(int rn, String name, float fees) {

		rn = rn;
		name = name;
		fees = fees;

	}

	void display() {
		System.out.println(rn + " " + name + " " + fees);
	}

}

public class NotkeyThis {

	public static void main(String[] args) {

		Student s1 = new Student(111, "ankit", 5000f);
		Student s2 = new Student(112, "sumit", 6000f);
		s1.display();
		s2.display();

	}

}
