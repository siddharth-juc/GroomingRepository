package me.grooming.GroomingRepository;

import me.grooming.GroomingRepository.MultiThreadingInUse.SimpleThread;

public class AppForMultiThreading {

	public static void main(String args[]) throws InterruptedException {

		/*
		 * First, we will get the reference to main thread.
		 * 
		 */
		Thread mainThread = Thread.currentThread();

		mainThread.setName("Line Main");

		/*
		 * Then, we will create our own SimpleThreads.
		 * 
		 */
		SimpleThread firstSimpleThread = new SimpleThread();

		firstSimpleThread.setName("Line 1B");

		SimpleThread secondSimpleThread = new SimpleThread();

		secondSimpleThread.setName("Line 2F");

		mainThread.setPriority(10);

		/*
		 * Now let's set the priorities of our threads.
		 * 
		 */
		firstSimpleThread.setPriority(4);
		secondSimpleThread.setPriority(5);

		/*
		 * Let's begin execution of both threads defined by us.
		 * 
		 */
		secondSimpleThread.start();

		/*
		 * join() means that other Thread should wait until the given Thread has
		 * finished its task.
		 * 
		 */
		secondSimpleThread.join();

		firstSimpleThread.start();
		firstSimpleThread.join();

		/*
		 * As expected, the main thread executes after both Simple Threads are done with
		 * their tasks.
		 */

		System.out.println("[ " + mainThread.getName() + " ] Wide Awake!!");

		/*
		 * Now let's interrupt both threads and then see what happens. To interrupt,
		 * kindly uncomment the code lines given below as needed.
		 * 
		 */

		/*
		 * firstSimpleThread.interrupt(); secondSimpleThread.interrupt();
		 */

	}

}