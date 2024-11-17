package programs;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 }; // array size undefined with 5 element

		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println("Element at index " + i + ": " + arr[i]); // printing array
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index out of bounds");
		}
	}
}
