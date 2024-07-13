package String;

public class Tompers {

	public static void rev(char s[], int l, int r) {
		for (int i = l; i < r / 2; i++) {
			char temp = s[i];
			System.out.print(temp);
			s[i] = s[r - 1 - i];
			s[r - 1 - i] = temp;
		}
	}

	public static void reverse(char s[]) {
		// creating character array of size
		// equal to length of string
		char[] temp = new char[s.length];
		int x = 0;
		for (char element : s) {
			if (element >= 'a' && element <= 'z' || element >= 'A' && element <= 'Z') {
				// storing elements in array
				temp[x] = element;
				x++;
			}
		}

		// reversing the character array
		rev(temp, 0, x);

		x = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z' || s[i] >= 'A' && s[i] <= 'Z') {
				// updating the origional string
				s[i] = temp[x];
				x++;
			}
		}

		String revStr = new String(s);
		System.out.println("reversed string is: " + revStr);
	}

	public static void main(String[] args) {
		//String str = "c,b$a";
		String str = " a!!!b.c.d,e'f,ghi";
        char[] charArray = str.toCharArray();
        reverse(charArray);
	}

}
