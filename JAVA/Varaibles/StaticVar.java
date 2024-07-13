package Varaibles;

class Agent {
	int id;
	String Agn;

	static String s = "CIA"; // Static Variable

	// constructor
	Agent(int i, String a) {
		id = i;
		Agn = a;
	}

	// method to display the values
	void display() {
		System.out.println("id: "+id + " Agent Name: " + Agn + " From: " + s);
	}
}

public class StaticVar {

	public static void main(String[] args) {
		Agent ag = new Agent(110,"Mark"),ag1 = new Agent(111,"Lowet"),ag2 = new Agent(112,"lucas");
		
		ag.display();
		ag1.display();
		ag2.display();
	}

}
