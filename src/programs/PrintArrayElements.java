package programs;

public class PrintArrayElements {

	public static void main(String[] args) {
		int arr[] = new int[100];

		// Initialize the array with numbers 1 to 100
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

}
