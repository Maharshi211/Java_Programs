package PracticeAllProgram;

public class Search_arr {

	public static void main(String[] args) {
		int[] a = {42,54,76,31,91,11,77,69,100,342,312,54,654,999};
		int i=0;
		for(i=0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		int s = 77;
		System.out.println("Search Array Element: "+s);
		
		int f= 0;
		
		for (i = 0; i < a.length; i++) {
			if (a[i] == s) {
				f = 1;
				break;	
			}
		}
		System.out.println(i);

		if (f == 1) {
			System.out.printf("The Element is found in the position : %d", i + 1);
			System.out.printf("\nThe Element is found in the index : %d", i);
		} else {
			System.out.println("The Element is Not found");
		}

	}

}
