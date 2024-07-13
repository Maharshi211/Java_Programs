package Object;

class Employee{
	int id;
	String name;
	float Salary;
	
	void insert(int i,String n, float s) {
		id=i;
		name = n;
		Salary = s;
		
	}
	
	void display() {
		System.out.println(id+" "+name+" "+Salary);
	}
	
}



public class ByConstructor {

	public static void main(String[] args) {
		Employee e1=new Employee();  
	    Employee e2=new Employee();  
	    Employee e3=new Employee();  
	    e1.insert(101,"ajeet",45000);  
	    e2.insert(102,"Lucas",25000);  
	    e3.insert(103,"nakul",55000);  
	    e1.display();  
	    e2.display();  
	    e3.display();  
	}

}
