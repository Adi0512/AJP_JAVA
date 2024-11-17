package programs;

import java.util.TreeMap;

public class ReturnRemoveTreeMap {
	public static void main(String[] args) {
		// Initialize TreeMap with some values
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("One", 1);
		map.put("Three", 3);
		map.put("Two", 2);

		System.out.println("Original TreeMap: " + map);

		// Remove the entry with key "Two" and store the removed value
		Integer removedValue = map.remove("Two");
		System.out.println("Removed value = " + removedValue);

		// Check if the entry {Three=3} exists and then remove it
		boolean isThreeRemoved = (map.containsKey("Three")) && (map.remove("Three") != null);
		System.out.println("Is the entry {Three=3} removed? " + isThreeRemoved);

		// Print the updated TreeMap
		System.out.println("Updated TreeMap: " + map);
	}
}
