package programs;

import java.util.HashSet;

public class AppendInHashSet {

	public static void main(String[] args) {
		// Create a HashSet
		HashSet<String> hst = new HashSet<String>();

		// Add elements to the set
		hst.add("Aditya");
		hst.add("Vishnu");
		hst.add("Deeksha");

		// Display Element before
		System.out.println("Previous=" + hst);

		// Append a new element
		String AppendElement = "Rishu";
		hst.add(AppendElement);

		// Display Element After Append
		System.out.println("After=" + hst);

	}

}
