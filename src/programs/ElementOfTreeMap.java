package programs;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ElementOfTreeMap {

	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		System.out.println("Using entrySet() with for-each loop:");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println("\nUsing keySet() with for-each loop:");
		for (String key : map.keySet()) {
			System.out.println("Key = " + key + ", Value = " + map.get(key));
		}

		System.out.println("\nUsing values() with for-each loop:");
		for (Integer value : map.values()) {
			System.out.println("Value = " + value);
		}

		System.out.println("\nUsing Iterator on entrySet():");
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		System.out.println("\nUsing Iterator on keySet():");
		Iterator<String> keyIterator = map.keySet().iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println("Key = " + key + ", Value = " + map.get(key));
		}

		System.out.println("\nUsing descendingMap() to iterate in reverse order:");
		for (Map.Entry<String, Integer> entry : map.descendingMap().entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}
}
