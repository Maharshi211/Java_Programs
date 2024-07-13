//Built-in Function
package Stack;
import java.util.Stack;
import java.lang.System;

public class St {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		
		st.push(21);
		st.push(11);
		st.push(53);
		st.push(23);
		st.push(71);
		
		System.out.println("size: "+st.size());
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println("size: "+st.size());


		
		
	}

}
