package programs;

import java.util.*;

public class ThreadSleep extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500); // Pause for 500 milliseconds
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
	}

	public static void main(String[] args) {
		ThreadSleep printerThread = new ThreadSleep();
		printerThread.start(); // Start the thread
	}
}
