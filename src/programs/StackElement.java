package programs;

import java.util.Stack;

public class StackElement {

	public static void main(String[] args) {
		// Create a Stack Element
		Stack<Integer> st = new Stack<Integer>();
		// Push 10 elements in the stack
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);
		st.push(80);
		st.push(90);
		st.push(100);
		// Display Stack element after push
		System.out.println("After Push the 10 Element: " + st);
		// Pop 4 elements from the stack
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		// Display Stack element after pop
		System.out.println("After Pop the 4 Element: " + st);

	}
}
