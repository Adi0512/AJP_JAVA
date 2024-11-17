package programs;

public class ThreadPrint implements Runnable {
	public void run() {
		for (int i = 0; i <= 4; i++) {
			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		Thread printerThread = new Thread(new ThreadPrint());
		printerThread.start(); // Start the thread
	}
}
