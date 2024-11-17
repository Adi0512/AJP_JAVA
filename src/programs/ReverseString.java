package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// Create a List of strings
		List<String> sl = new ArrayList<>();

		// Add elements to the List
		sl.add("Aditya");
		sl.add("Rohan");
		sl.add("Omika");
		sl.add("Khusi");
		sl.add("Vishnu");
		sl.add("Kajal");

		// Print original List
		System.out.println("Original List: " + sl);

		// Reverse the List
		Collections.reverse(sl);

		// Print reversed List
		System.out.println("Reversed List: " + sl);

	}

}
