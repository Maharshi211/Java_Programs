package Object;

class SBM {
	int rn;
	String name;

	void insertRecord(int r, String n) {
		rn = r;
		name = n;
	}

	void BMD() {
		System.out.println(rn + " " + name);
	}

}

public class ByMethod {

	public static void main(String[] args) {
 
		SBM s1 = new SBM();
		SBM s2 = new SBM();

		s1.insertRecord(1, "Karan");
		s2.insertRecord(3, "Arjun");

		s1.BMD();
		s2.BMD();

	}

}
