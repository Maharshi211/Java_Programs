package Polymorphism;

class Add {
	public static int mul(int a, int b) {
		return a * b;
	}

	public static float mul(float a, float b, float c) {
		return a * b * c;
	}
}

public class Compiletime {

	public static void main(String[] args) {
		System.out.println(Add.mul(2, 3));
		System.out.println(Add.mul(2, 5, 9));
	}

}
