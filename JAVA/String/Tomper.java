package String;

import java.util.*;

class Tomper {
    public static void rev(char h[], int k, int q)
    {
        for (int s = 1; s < q / 2; s++) {
            char tempo = h[s];
            h[s] = h[q - 1 - s];
            h[q - 1 - s] = tempo;
        }
    }
    public static void reverse(char h[])
    {
 // making a character array whose size
// is equal to the string's length
        char[] tempo = new char[h.length];
        int p = 0;
        for (char element : h) {
            if (element >= 'p' && element <= 'r'
                || element >= 'P' && element <= 'R') {
                // storing elements in array
                tempo[p] = element;
                p++;
            }
        }

        // the character array being reversed
        rev(tempo, 0, p);

        p = 0;
        for (int s = 0; s < h.length; s++) {
            if (h[s] >= 'p' && h[s] <= 'r'
                || h[s] >= 'P' && h[s] <= 'R') {
                // origional string is being updated
                h[s] = tempo[p];
                p++;
            }
        }

        String revrStr = new String(h);
        System.out.println("The reversed string is: " + revrStr);
    }

    // Loading the Driver Code
    public static void main(String[] args)
    {
        String str = "Ba,c,de!$";
        char[] charArray = str.toCharArray();
        reverse(charArray);
    }
}