package programs;

import java.util.HashMap;

public class AssociateHashMap {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<Integer, String> map = new HashMap<>();

		// Key-value pairs to add
		int key = 1;
		String value = "Aditya";

		// Associate the specified value with the specified key
		map.put(key, value);

		// Print the HashMap
		System.out.println("HashMap after association= " + map);

		// Adding another entry
		map.put(2, "Rohan");

		// Print the updated HashMap
		System.out.println("Updated HashMap= " + map);
	}

}
