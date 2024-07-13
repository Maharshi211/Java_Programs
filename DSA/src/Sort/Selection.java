package Sort;

public class Selection {

	public static void main(String[] args) {
		int x[] = { 40, 60, 10, 20, 30 };
//		int count = 0;
		for (int i = 0; i < x.length - 1; i++) {
//			count++;
//			System.out.println(count+" Pass");
			int min = i;
			for (int j = i + 1; j < x.length; j++) {

//				System.out.println("outer x[j] = "+x[j] +", x[min] = "+x[min]);

				if (x[j] < x[min]) {
					min = j;
//					System.out.println("inner x[j] = "+j+" "+x[j] +", x[min] = "+x[min]+" "+min);
				}
//				System.out.println();

			}
			int temp = x[min];
			x[min] = x[i];
			x[i] = temp;

//			System.out.println("x[j] = "+x[i] +", x[min] = "+x[min]);
//			System.out.println();
		}

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

	}

}
