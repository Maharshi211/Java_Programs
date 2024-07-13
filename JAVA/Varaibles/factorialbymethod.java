package Varaibles;

class Calculation{
	
	void fact(int n) {
		
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact*i;
		}
		System.out.println("Number "+n+": Factorial "+fact);
		
	}
	
}

public class factorialbymethod {

	public static void main(String[] args) {

//		Calculation c = new Calculation();
//		c.fact(5);
		
		new Calculation().fact(6); //calling method with anonymous object  
		
		
	}

}
