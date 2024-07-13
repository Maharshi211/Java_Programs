package Varaibles;

class Student1 {
	int rn;
	String name;
	float fees;

	Student1(int rn, String name, float fees) {

		this.rn = rn;
		this.name = name;
		this.fees = fees;

	}

	void display() {
		System.out.println(rn + " " + name + " " + fees);
	}

}

public class UsingThisKey {

	public static void main(String[] args) {
		Student1 s1 = new Student1(111, "ankit", 5000f);
		Student1 s2 = new Student1(112, "sumit", 6000f);
		s1.display();
		s2.display();

	}

}
