package Stack;

import java.util.Arrays;
import java.util.Scanner;

class stack {
	Scanner sc = new Scanner(System.in);
	private int top = -1;
	private int n = 4;
	int[] a = new int[n];

	public void push(int d) {
		if (top == (n - 1)) {
			System.out.print("Stack is now 'overflow' ");
			System.out.println();
		} else {
			top++;
			a[top] = d;
			System.out.println(d + " Element is inserted" + " top is now: " + top);

		}

	}

	public void pop() {
		if (top == -1) {
			System.out.println("Underflow \n");
		} else {
			int k = 0;
			k = a[top];
			top--;
			System.out.println(k + " Element Deleted.");
		}
	}

	boolean isEmpty() {
		return top == -1;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Stack is empty, Please Enter Stack Element");
			System.out.println();
			return;
		}
		System.out.print("Stack element is: ");
		System.out.println(Arrays.toString(a));
		for (int i = top; i >= 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println();
	}

}

public class Fixedsizestack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stack s = new stack();
		int l = 0;

		do {
			System.out.println("Stack Operations:");
			System.out.println("0. Exit");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. display");
//			System.out.println("4. cls");
			System.out.println();

			System.out.print("Enter Your choice: ");
			int choice = sc.nextInt();

			switch (choice) {

			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.print("Enter Your Elemnt: ");
				int d = sc.nextInt();
				s.push(d);
				System.out.println();
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;

			default:
				System.out.println("Eneter Proper Choice......");

			}

		} while (l == 0);

	}

}
