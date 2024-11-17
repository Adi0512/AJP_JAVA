package programs;

import java.util.HashMap;

public class HashMapEmptyCheck {
	public static void main(String[] args) {
		// Create a HashMap
		HashMap<Integer, String> map = new HashMap<>();

		// Check if the HashMap is empty
		if (map.isEmpty()) {
			System.out.println("The HashMap is empty.");
		} else {
			System.out.println("The HashMap contains key-value mappings.");
		}

		// Adding some entries to the HashMap
		map.put(101, "Aditya");
		map.put(102, "Vishnu");

		// Check again if the HashMap is empty
		if (map.isEmpty()) {
			System.out.println("The HashMap is empty.");
		} else {
			System.out.println("The HashMap contains key-value mappings.");
		}
	}

}
