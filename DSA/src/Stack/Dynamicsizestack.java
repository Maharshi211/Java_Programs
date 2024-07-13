package Stack;

import java.util.Scanner;
import java.util.Arrays;

class dynamic {
	private int[] x;
	private int top = -1;
	private int size;

	public dynamic() {
		size = 1;
		x = new int[size];
		top = -1;
	}

	public void expandsize() {
		int[] y = new int[size * 2];
		for (int i = 0; i < size; i++) {
			y[i] = x[i];
		}
		x = y;
		;
		size = size * 2;

	}

	public void push(int data) {
		if (top == size - 1) {
			expandsize();
		}
		x[++top] = data;
		System.out.println(data);
	}

	public void pop() {
		if (top == -1) {
			System.out.println("Underflow \n");
		} else {
			int k = 0;
			k = x[top];
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
			System.out.println(Arrays.toString(x)+" "+size);
			return;
		}
		System.out.print("Stack element is: ");
		System.out.println(Arrays.toString(x)+" Now Array size is: "+size);
		for (int i = top; i >= 0; i--) {
			System.out.println(x[i]);
		}
		System.out.println();
	}

}

public class Dynamicsizestack {

	public static void main(String[] args) {
		int l = 0;
		Scanner sc = new Scanner(System.in);

		dynamic dy = new dynamic();
		do {
			System.out.println("Stack Operations(Dynamic stack):");
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
				System.out.print("Enter data to push: ");
				int data = sc.nextInt();
				dy.push(data);

				break;
			case 2:
				dy.pop();
				break;
			case 3:
				dy.display();
				break;

			default:
				System.out.println("Eneter Proper Choice......");

			}

		} while (l == 0);

	}

}
