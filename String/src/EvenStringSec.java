import java.lang.System;

public class EvenStringSec {

	public static void main(String[] args) {
		
		String s = "one two three one two thre"; 
		
		for (String word : s.split(" ")) 
			   // if length is even 
			   if (word.length() % 2 == 0) 
			 
			    // Print the word 
			    System.out.println(word); 
			
	}

}
