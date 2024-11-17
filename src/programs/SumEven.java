package programs;

import java.util.ArrayList;

public class SumEven {

	public static void main(String[] args) {
		// Create an ArrayList of integers
		ArrayList<Integer> numbers = new ArrayList<>();

		// Add elements to the ArrayList
		numbers.add(10);
		numbers.add(23);
		numbers.add(40);
		numbers.add(57);
		numbers.add(90);
		numbers.add(13);
		numbers.add(76);

		// Print original ArrayList
		System.out.println("Original ArrayList: " + numbers);

		// Calculate sum of even numbers
		int sum = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				sum = sum + number;
			}
		}

		// Print sum of even numbers
		System.out.println("Sum of even numbers: " + sum);

	}

}
