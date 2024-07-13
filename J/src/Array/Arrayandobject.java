package Array;

class Employees{
	int eid;
	String en;
	int es;
	
}

public class Arrayandobject {

	public static void main(String[] args) {
		
		Employees e = new Employees();
		e.eid = 1;
		e.en = "Micheal";
		e.es = 30000;
		
		Employees e1 = new Employees();
		e1.eid = 2;
		e1.en = "dem";
		e1.es = 40000;
		
		Employees e2 = new Employees();
		e2.eid = 3;
		e2.en = "kecho";
		e2.es = 3000;
		
		Employees e3 = new Employees();
		e3.eid = 4;
		e3.en = "likasa";
		e3.es = 10000;

		
//		Employees e4 = new Employees();
//		e4.eid = 0;
//		e4.en = null;
//		e4.es = 300;
		
		Employees ep[] = new Employees[4];
		ep[0] = e;
		ep[1] = e1;
		ep[2] = e2;
		ep[3] = e3;
//		ep[4] = e4;
		
		
		for (int i = 0; i < ep.length; i++) {
			System.out.println("Employees id: "+ep[i].eid+" "+",Employee Name: "+ep[i].en+" "+",Employee Salary: "+ep[i].es);
		}
		
		System.out.println();
	
		
		
		

	}

}
