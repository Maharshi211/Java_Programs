package Stack;
import java.util.Scanner;

class stacks {
	
	Scanner sc = new Scanner(System.in); 

	int top = -1;
	int n = 10;
	int[] a = new int[n];
	
	void push() {
		if(top  == (n-1)) {
			System.out.println("Overflow");
		}
		else {
			System.out.print("Enter Data ");
			int i = sc.nextInt();
			top = top+1;
			a[top] = i;
			System.out.println("Element is Inserted.");
		}
	}
	
	void pop() {
		if(top == -1) {
			System.out.print("Underflow");
		}else {
			top = top - 1;
			System.out.println("Element Deleted.");
		}
	}
	
	void display() {
		System.out.println("item are...");
		for (int j = top; j < 0; j--){
			System.out.println(a[j]+" ");
		}
	}
	

}

public class dStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stacks s = new stacks();
		int l;
		
		do {
		System.out.println("\nStack Operations:");
		System.out.println("0. Exit");
		System.out.println("1. Push");
		System.out.println("2. Pop");		
		System.out.println("3. Display");

		System.out.print("Enter choice: ");
		int choice = sc.nextInt();

		switch (choice) {
			
		case 1:
			s.push();
			break;
		case 2:
			s.pop();
			break;
		case 3:
			s.display();
			break;
		
		
		}
		System.out.println("Enter press 0 to go back ");
		System.out.println("Enter press key to exit ");
		l = sc.nextInt();
		}while(l == 0);
		
		System.out.println("Exit Sucessfully.");

	}

}