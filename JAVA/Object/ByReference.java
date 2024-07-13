package Object;

class Student {
	int id;
	String name;
	public String String;
}

public class ByReference {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();

		s1.id = 100;
		s1.String = "Afe";
		s2.id = 200;
		s2.String = "feriu";
		s1.id = 300;

		System.out.println(s1.id+" "+s1.String);
		System.out.println(s2.id+" "+s2.String);
		
		
	}

}
